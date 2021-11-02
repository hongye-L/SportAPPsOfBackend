package ApplicaionOfVideos.Util;

public class JsonResult {
    /*
    成功没有？
     */
    public boolean success;
    /*
    消息
     */
    public String message;
    /*
    返回码
     */
    public String code;
    /*
    其他东西
     */
    public  Object object;

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
    public JsonResult (boolean success,String code,Object object){
        this(success,code);
        this.object=object;
        this.message= ReturnCodeUtil.getMsg(code);
    }
    /*
    啥都没有的构造方法
     */
    public JsonResult(){}

    public JsonResult(boolean success,String code){
        this(success);
        this.code=code;
        this.message= ReturnCodeUtil.getMsg(code);
    }

    public JsonResult (boolean success){
        this.success=success;
    }
    /*
    这里的message由传入的message决定。
     */
    public JsonResult(boolean success,String code,String message){
        this(success);
        this.code=code;
        this.message=message;
    }
}
