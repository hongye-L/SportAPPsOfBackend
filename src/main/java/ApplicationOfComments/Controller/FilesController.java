package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.Files;
import ApplicationOfComments.Service.FilesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Files controller.
 * @author 竑也
 */
@RestController
public class FilesController {
    private static final Logger logger = LoggerFactory.getLogger(FilesController.class);

    @Autowired
    private FilesService fileService;

    /**
     * Upload file files.
     *
     * @param multipartFile the multipart file
     * @return the files
     */
    @PostMapping("/uploadFile")
    public Files uploadFile(@RequestParam(value ="file") MultipartFile multipartFile){
        String fileName = fileService.storeFile(multipartFile);
        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new Files(fileName, fileDownloadUri,
                multipartFile.getContentType(), multipartFile.getSize());
    }

    /**
     * Upload multiple files list.
     *
     * @param files the files
     * @return the list
     */
    @PostMapping("/uploadMultipleFiles")
    public List<Files> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        List<Files> list = new ArrayList<>();
        if (files != null) {
            for (MultipartFile multipartFile:files) {
                Files uploadFileResponse = uploadFile(multipartFile);
                list.add(uploadFileResponse);
            }
        }
        return list;
        //简单写法
        /* return Arrays.stream(files)
                .map(this::uploadFile)
                .collect(Collectors.toList());*/
    }

    /**
     * Download file response entity.
     *
     * @param fileName the file name
     * @param request  the request
     * @return the response entity
     */
    @GetMapping("/downloadFile/{fileName:.*}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        Resource resource = fileService.loadFileAsResource(fileName);
        String contentType = null;
        try {
            request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException e) {
            logger.info("Could not determine file type.");
        }
        if(contentType == null) {
            contentType = "application/octet-stream";
        }
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
