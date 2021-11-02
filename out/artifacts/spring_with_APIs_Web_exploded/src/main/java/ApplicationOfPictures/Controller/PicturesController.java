package ApplicationOfPictures.Controller;

import ApplicationOfComments.Model.comments;
import ApplicationOfComments.Service.CommentService;
import ApplicationOfComments.Util.GlobalReturnCode;
import ApplicationOfComments.Util.JsonResult;
import ApplicationOfPictures.Model.Pictures;
import ApplicationOfPictures.Service.PicturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/pictures")
public class PicturesController {
    @Autowired
    private PicturesService picturesService;

    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody Pictures pictures){
        int flag=picturesService.add(pictures);
        if(flag==1){
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest,@RequestBody Pictures pictures){
        int flag=picturesService.update(pictures);
        if (flag==1){
            return new JsonResult(true,GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/delete")
    public JsonResult delete(HttpServletRequest httpServletRequest, @RequestBody Map<String,String> map){
        int flag=picturesService.delete(Integer.parseInt(map.get(("id"))));
        if(flag==1){
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/list")
    public JsonResult list(HttpServletRequest httpServletRequest){
        List<Pictures> list=picturesService.getlist();
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }
    @PostMapping("/get")
    public JsonResult get(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        Pictures pictures=picturesService.get(Integer.parseInt(map.get("id")));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,pictures);
    }
}
