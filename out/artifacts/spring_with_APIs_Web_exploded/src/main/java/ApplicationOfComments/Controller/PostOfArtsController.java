package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.POSTs;
import ApplicationOfComments.Model.PostGoods;
import ApplicationOfComments.Service.PostOfArtsService;
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
 * The type Post of arts controller.
 *
 * @author 竑也
 */
@RestController
@RequestMapping("/PostOfArts")
public class PostOfArtsController {
    @Autowired
    private PostOfArtsService postService;

    /**
     * Add json result.
     *
     * @param httpServletRequest the http servlet request
     * @param posTs              the posts
     * @return the json result
     */
    @PostMapping("/add")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody POSTs posTs) {
        int flag = postService.add(posTs);
        if (flag == 1) {
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        } else {
            return new JsonResult(false, GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * Update json result.
     *
     * @param httpServletRequest the http servlet request
     * @param posTs              the pos ts
     * @return the json result
     */
    @PostMapping("/update")
    public JsonResult update(HttpServletRequest httpServletRequest, @RequestBody POSTs posTs) {
        int flag = postService.update(posTs);
        if (flag == 1) {
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        } else {
            return new JsonResult(false, GlobalReturnCode.OPERA_FAILURE);
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
    public JsonResult delete(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        int flag = postService.delete((map.get(("post_id"))));
        if (flag == 1) {
            return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS);
        } else {
            return new JsonResult(false, GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * List json result.
     *
     * @param httpServletRequest the http servlet request
     * @return the json result
     */
    @PostMapping("/list")
    public JsonResult list(HttpServletRequest httpServletRequest) {
        List<POSTs> list = postService.getlist();
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,list);
    }

    /**
     * Get json result.
     *
     * @param httpServletRequest the http servlet request
     * @param map                the map
     * @return the json result
     */
    @PostMapping("/get")
    public JsonResult get(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        POSTs posTs=postService.get(map.get("post_id"));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,posTs);
    }

    /**
     * Add goods json result.
     *
     * @param httpServletRequest the http servlet request
     * @param postGoods          the post goods
     * @return the json result
     */
    @PostMapping("/addGoods")
    public JsonResult addGoods(HttpServletRequest httpServletRequest, @RequestBody PostGoods postGoods) {
        int flag = postService.addGoods(postGoods);
        if (flag == 1) {
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        } else {
            return new JsonResult(false, GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * Del goods json result.
     *
     * @param httpServletRequest the http servlet request
     * @param postGoods          the post goods
     * @return the json result
     */
    @PostMapping("/deleteGoods")
    public JsonResult delGoods(HttpServletRequest httpServletRequest, @RequestBody PostGoods postGoods) {
        int flag = postService.deleteGoods(postGoods);
        if (flag == 1) {
            return new JsonResult(true, GlobalReturnCode.SAVE_SUCCESS);
        } else {
            return new JsonResult(false, GlobalReturnCode.OPERA_FAILURE);
        }
    }

    /**
     * Gets goods.
     *
     * @param httpServletRequest the http servlet request
     * @param map                the map
     * @return the goods
     */
    @PostMapping("/getGoods")
    public JsonResult getGoods(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        PostGoods postGoods=postService.getGoods(map.get("post_id"),map.get("user_id"));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,postGoods);
    }
}