package ApplicationOfComments.Util;

public class JsonResult {
    /*
    成功没有？
     */
    private boolean success;
    /*
    消息
     */
    private String message;
    /*
    返回码
     */
    private String code;
    /*
    其他东西
     */
    private Object items;

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

    public void setObjects(Object items) {
        this.items =items;
    }

    public Object getItems() {
        return items;
    }

    public void setItems(Object items) {
        this.items = items;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonResult (boolean success, String code, Object items){
        this(success,code);
        this.items= items;
        this.message=ReturnCodeUtil.getMsg(code);
    }
    /*
    啥都没有的构造方法
     */
    public JsonResult(){}

    public JsonResult(boolean success,String code){
        this(success);
        this.code=code;
        this.message=ReturnCodeUtil.getMsg(code);
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
