package ApplicationOfComments.Controller;

import ApplicationOfComments.Service.FilesService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/files")
public class FilesController {
    @Autowired
    private FilesService filesService;

    /**
     * 下载文件接口
     *
     */
    @RequestMapping(value = "/download/{name}")
    public void Download(@PathVariable String name, HttpServletResponse response) throws Exception {
        filesService.Download(name, response);
    }

    /**
     * 上传文件接口
     *
     */
    @PostMapping(value = "/upload")
    public JSONObject Upload(@RequestParam("file") MultipartFile file) throws Exception {
        return filesService.Upload(file);
    }

    /**
     * 批量上传文件接口
     *
     */
    @PostMapping(value = "/uploads")
    public JSONObject Uploads(HttpServletRequest request) throws Exception {
        return filesService.Uploads(request);
    }
}
