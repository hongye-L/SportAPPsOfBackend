package ApplicationOfComments.Controller;

import ApplicationOfComments.Model.Users;
import ApplicationOfComments.Service.UserService;
import ApplicationOfComments.Util.GlobalReturnCode;
import ApplicationOfComments.Util.JsonResult;
import ApplicationOfComments.Util.RedisKey;
import ApplicationOfComments.Util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ApplicationOfComments.LoginDto.dto;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtil redisUtil;
    @PostMapping("/checklogin")
    public JsonResult checklogin(HttpServletRequest httpServletRequest,@RequestBody dto Dto){
        Users users=userService.getByUsername(Dto.getUsername());
        //登录成功！
        if(users!=null&&users.getPassword().equals(Dto.getPassword())) {
            String accessToken = UUID.randomUUID().toString();
            //把accessToken塞到Redis内
            redisUtil.set(RedisKey.ACCESS_TOKEN + accessToken, users, 30 + 60);
            Map<String, String> map = new HashMap<>();
            map.put("accessToken", accessToken);
            JsonResult jsonResult = new JsonResult(true, GlobalReturnCode.OPERA_SUCCESS, accessToken);
            return jsonResult;
        }else{
            JsonResult jsonResult=new JsonResult(false,"20001");
            return jsonResult;
        }
    }
}
