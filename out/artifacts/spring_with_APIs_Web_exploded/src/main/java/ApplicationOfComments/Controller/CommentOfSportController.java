package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.comments;
import ApplicationOfComments.Service.CommentOfSportService;
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
 * The type Comment of sport controller.
 * @author 竑也
 */
@RestController
@RequestMapping("/commentOfSports")
public class CommentOfSportController {
    @Autowired
    private CommentOfSportService commentService;

    /**
     * Add json result.
     *
     * @param httpServletRequest the http servlet request
     * @param comments           the comments
     * @return the json result
     */
    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody comments comments){
        int flag=commentService.add(comments);
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
     * @param comments           the comments
     * @return the json result
     */
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest,@RequestBody comments comments){
        int flag=commentService.update(comments);
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
        int flag=commentService.delete((map.get(("comment_id"))));
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
        List<comments> list=commentService.getlist();
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
        comments comments=commentService.get(map.get("comment_id"));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,comments);
    }

    /**
     * Reply list json result.
     *
     * @param httpServletRequest the http servlet request
     * @param map                the map
     * @return the json result
     */
    @PostMapping("/commentlist")
    public JsonResult ReplyList(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        List<comments> list = commentService.commentsList(Integer.parseInt(map.get("post_id")));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS, list);
    }
}
