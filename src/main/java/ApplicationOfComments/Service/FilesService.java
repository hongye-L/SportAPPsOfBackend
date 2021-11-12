package ApplicationOfComments.Service;

import ApplicationOfComments.Util.GlobalException;
import ApplicationOfComments.Util.ReturnMessage;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
@Service
public class FilesService {
    public void Download(String name, HttpServletResponse response) throws Exception {
        File file = new File("logs" + File.separator + name);

        if (!file.exists()) {
            throw new GlobalException(name + "文件不存在");
        }
        response.setContentType("application/force-download");
        response.addHeader("Content-Disposition", "attachment;fileName=" + name);
        response.setContentLength((int) file.length());

        byte[] buffer = new byte[1024];
        try (FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            OutputStream os = response.getOutputStream();

            int i = bis.read(buffer);
            while (i != -1) {
                os.write(buffer, 0, i);
                i = bis.read(buffer);
            }
        }
    }

    public JSONObject Upload(MultipartFile file) throws Exception {
        if (file == null || file.isEmpty()) {
            throw new GlobalException("未选择需上传的文件");
        }

        String filePath = new File("logs_app").getAbsolutePath();
        File fileUpload = new File(filePath);
        if (!fileUpload.exists()) {
            fileUpload.mkdirs();
        }

        fileUpload = new File(filePath, file.getOriginalFilename());
        if (fileUpload.exists()) {
            throw new GlobalException("上传的文件已存在");
        }

        try {
            file.transferTo(fileUpload);
            return ReturnMessage.success();
        } catch (IOException e) {
            throw new GlobalException("上传文件到服务器失败：" + e.toString());
        }
    }

    public JSONObject Uploads(HttpServletRequest request) throws Exception {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");

        for (MultipartFile file : files) {
            Upload(file);
        }

        return ReturnMessage.success();
    }
}
