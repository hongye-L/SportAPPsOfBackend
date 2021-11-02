package ApplicaionOfVideos.Controller;

import ApplicaionOfVideos.Model.Videos;
import ApplicaionOfVideos.Service.VideoService;
import ApplicationOfComments.Util.GlobalReturnCode;
import ApplicationOfComments.Util.JsonResult;
import ApplicationOfPictures.Model.Pictures;
import ApplicationOfPictures.Service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody Videos videos){
        int flag=videoService.add(videos);
        if(flag==1){
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest,@RequestBody Videos videos){
        int flag=videoService.update(videos);
        if (flag==1){
            return new JsonResult(true,GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/delete")
    public JsonResult delete(HttpServletRequest httpServletRequest, @RequestBody Map<String,String> map){
        int flag=videoService.delete(Integer.parseInt(map.get(("id"))));
        if(flag==1){
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/list")
    public JsonResult list(HttpServletRequest httpServletRequest){
        List<Videos> list=videoService.getlist();
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }
    @PostMapping("/get")
    public JsonResult get(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        Videos videos=videoService.get(Integer.parseInt("id"));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,videos);
    }
}
