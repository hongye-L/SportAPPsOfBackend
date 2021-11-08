package ApplicationOfComments.Controller;
import ApplicationOfComments.Service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
public class DownloadController {

    @RestController
    @RequestMapping("/download")
    public class LogController {
        @Autowired
        private DownloadService downloadService;
        @GetMapping(value = "/{name}")
        public void logDownload(@PathVariable String name, HttpServletResponse response) throws Exception {
            downloadService.Download(name, response);
        }
    }
}
