package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.replys;
import ApplicationOfComments.Service.ReplyOfTeachingService;
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

/**
 * The type Reply of teaching controller.
 */
@RestController
@RequestMapping("/replyOfTeaching")
public class ReplyOfTeachingController {
    @Autowired
    private ReplyOfTeachingService replyService;

    /**
     * Add json result.
     *
     * @param httpServletRequest the http servlet request
     * @param replys             the replys
     * @return the json result
     */
    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody replys replys){
        int flag=replyService.add(replys);
        if(flag==1){
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * Update json result.
     *
     * @param httpServletRequest the http servlet request
     * @param replys             the replys
     * @return the json result
     */
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest,@RequestBody replys replys){
        int flag=replyService.update(replys);
        if (flag==1){
            return new JsonResult(true,GlobalReturnCode.SAVE_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * Delete json result.
     *
     * @param httpServletRequest the http servlet request
     * @param map                the map
     * @return the json result
     */
    @PostMapping("/delete")
    public JsonResult delete(HttpServletRequest httpServletRequest, @RequestBody Map<String,String> map){
        int flag=replyService.delete((map.get(("reply_id"))));
        if(flag==1){
            return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS);
        }else {
            return new JsonResult(false,GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * List json result.
     *
     * @param httpServletRequest the http servlet request
     * @return the json result
     */
    @PostMapping("/list")
    public JsonResult list(HttpServletRequest httpServletRequest){
        List<replys> list=replyService.getlist();
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }

    /**
     * Get json result.
     *
     * @param httpServletRequest the http servlet request
     * @param map                the map
     * @return the json result
     */
    @PostMapping("/get")
    public JsonResult get(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        replys replys=replyService.get(map.get("reply_id"));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,replys);
    }

    /**
     * Reply list json result.
     *
     * @param httpServletRequest the http servlet request
     * @param map                the map
     * @return the json result
     */
    @PostMapping("/replylist")
    public JsonResult ReplyList(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        List<replys> list=replyService.replysList(Integer.parseInt(map.get("comment_id")));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,list);
    }
}
