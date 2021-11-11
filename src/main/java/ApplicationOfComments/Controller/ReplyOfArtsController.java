package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.replys;
import ApplicationOfComments.Service.ReplyOfArtsService;
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
@RequestMapping("/replyOfArts")
public class ReplyOfArtsController {
    @Autowired
    private ReplyOfArtsService replyService;

    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody replys replys){
        int flag=replyService.add(replys);
        if(flag==1){
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest,@RequestBody replys replys){
        int flag=replyService.update(replys);
        if (flag==1){
            return new JsonResult(true,GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/delete")
    public JsonResult delete(HttpServletRequest httpServletRequest, @RequestBody Map<String,String> map){
        int flag=replyService.delete((map.get(("reply_id"))));
        if(flag==1){
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/list")
    public JsonResult list(HttpServletRequest httpServletRequest){
        List<replys> list=replyService.getlist();
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }
    @PostMapping("/get")
    public JsonResult get(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        replys replys=replyService.get(map.get("reply_id"));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,replys);
    }
    @PostMapping("/replylist")
    public JsonResult ReplyList(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        List<replys> list=replyService.replysList(Integer.parseInt(map.get("comment_id")));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }
}
