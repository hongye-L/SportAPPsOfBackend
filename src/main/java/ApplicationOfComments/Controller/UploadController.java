package ApplicationOfComments.Controller;

import net.sf.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;
@RestController
@RequestMapping("/upload")
public class UploadController {
    public ResponseEntity<JSONObject> uploadImageFile(@RequestParam("img") MultipartFile uploadImage,
                                                      @RequestParam String token,
                                                      @RequestParam String type){
        JSONObject json = new JSONObject();
        try {
            if(uploadImage==null){
                json.put("STATUS", "ERROR");
                json.put("MSG", "上传失败，上传图片数据为空");
                return new ResponseEntity<JSONObject>(json, HttpStatus.BAD_REQUEST);
            }

            String suffix = uploadImage.getContentType().toLowerCase();//图片后缀，用以识别哪种格式数据
            suffix = suffix.substring(suffix.lastIndexOf("/")+1);

            if(suffix.equals("jpg") || suffix.equals("jpeg") || suffix.equals("png") || suffix.equals("gif")) {
                String fileName = type + "_" + UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
                String imgFilePath = "D:\\logs\\";//新生成的图片

                File targetFile = new File(imgFilePath, fileName);
                if(!targetFile.getParentFile().exists()){ //注意，判断父级路径是否存在
                    targetFile.getParentFile().mkdirs();
                }
                //保存
                uploadImage.transferTo(targetFile);

                json.put("STATUS", "200");
                json.put("MSG", "上传图片成功");
                return new ResponseEntity<JSONObject>(json, HttpStatus.OK);
            }
            json.put("STATUS", "ERROR");
            json.put("MSG", "上传图片格式非法");
            return new ResponseEntity<JSONObject>(json, HttpStatus.BAD_REQUEST);//500,系统异常
        } catch (Exception e) {
            json.put("STATUS", "ERROR");
            json.put("MSG", "系统异常，上传图片失败");
            return new ResponseEntity<JSONObject>(json, HttpStatus.INTERNAL_SERVER_ERROR);//500,系统异常
        }
    }
}
