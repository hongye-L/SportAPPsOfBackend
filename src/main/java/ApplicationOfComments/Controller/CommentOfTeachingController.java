package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.comments;
import ApplicationOfComments.Service.CommentOfTeachingService;
import ApplicationOfComments.Util.GlobalReturnCode;
import ApplicationOfComments.Util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/commentOfTeaching")
public class CommentOfTeachingController {
    @Autowired
    private CommentOfTeachingService commentService;

    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody comments comments){
        int flag=commentService.add(comments);
        if(flag==1){
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest,@RequestBody comments comments){
        int flag=commentService.update(comments);
        if (flag==1){
            return new JsonResult(true,GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/delete")
    public JsonResult delete(HttpServletRequest httpServletRequest, @RequestBody Map<String,String> map){
        int flag=commentService.delete((map.get(("id"))));
        if(flag==1){
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/list")
    public JsonResult list(HttpServletRequest httpServletRequest){
        List<comments> list=commentService.getlist();
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }
    @PostMapping("/get")
    public JsonResult get(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        comments comments=commentService.get(map.get("id"));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,comments);
    }
    @PostMapping("/commentlist")
    public JsonResult ReplyList(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        List<comments> list = commentService.commentsList(Integer.parseInt(map.get("id")));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS, list);
    }
}
