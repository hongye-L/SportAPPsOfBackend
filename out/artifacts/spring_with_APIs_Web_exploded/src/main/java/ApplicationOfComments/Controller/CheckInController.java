package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.POSTs;
import ApplicationOfComments.Service.CheckService;
import ApplicationOfComments.Util.GlobalReturnCode;
import ApplicationOfComments.Util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
@RestController
@RequestMapping("/")
public class CheckInController {
    @Autowired
    CheckService checkService;
    @PostMapping("/CheckSport")
    public JsonResult getSport(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        POSTs posTs=checkService.getSports(map.get("nickname"));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,posTs);
    }
    @PostMapping("/CheckArts")
    public JsonResult getArts(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        POSTs posTs=checkService.getArts(map.get("nickname"));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,posTs);
    }
    @PostMapping("/CheckTeaching")
    public JsonResult getTeaching(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        POSTs posTs=checkService.getTeaching(map.get("nickname"));
        return new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS,posTs);
    }
}
