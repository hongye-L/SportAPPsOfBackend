package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.Users;
import ApplicationOfComments.Service.UserService;
import ApplicationOfComments.Util.GlobalReturnCode;
import ApplicationOfComments.Util.JsonResult;
import ApplicationOfComments.Util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public JsonResult checklogin(HttpServletRequest httpServletRequest, @RequestBody Map<String, String> map) {
        Users users = userService.getByUsername(map.get("username"), map.get("password"));
        if (users == null)
            return new JsonResult(false, "20102");//账号或密码错误
        else
            return new JsonResult(true, "20103");//登录成功
    }

    @PostMapping("/signin")
    public JsonResult add(HttpServletRequest httpServletRequest, @RequestBody Users users) {
        int flag = userService.add(users);
        if (flag == 1) {
            return new JsonResult(true, "20101");//注册成功!
        } else {
            return new JsonResult(false, GlobalReturnCode.OPERA_FAILURE);
        }
    }
    @PostMapping("/user")
    public JsonResult usersList(HttpServletRequest httpServletRequest,@RequestBody Map<String,String> map){
        Users users=userService.list(map.get("username"));
        return new JsonResult(true,GlobalReturnCode.OPERA_SUCCESS,users);
    }
}