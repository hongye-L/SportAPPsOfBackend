package ApplicationOfComments.Util;

/**
 * The type Json result.
 * @author 竑也
 */
public class JsonResult {
    /*
    *成功没有？
     */
    private boolean success;
    /*
    *消息
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

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Sets objects.
     *
     * @param items the items
     */
    public void setObjects(Object items) {
        this.items =items;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public Object getItems() {
        return items;
    }

    /**
     * Sets items.
     *
     * @param items the items
     */
    public void setItems(Object items) {
        this.items = items;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     * @param code    the code
     * @param items   the items
     */
    public JsonResult (boolean success, String code, Object items){
        this(success,code);
        this.items= items;
        this.message=ReturnCodeUtil.getMsg(code);
    }

    /**
     * Instantiates a new Json result.
    啥都没有的构造方法
     */
    public JsonResult(){}

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     * @param code    the code
     */
    public JsonResult(boolean success,String code){
        this(success);
        this.code=code;
        this.message=ReturnCodeUtil.getMsg(code);
    }

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     */
    public JsonResult (boolean success){
        this.success=success;
    }

    /**
     * Instantiates a new Json result.
     *
     * @param success the success
     * @param code    the code
     * @param message the message
     *这里的message由传入的message决定。
     */
    public JsonResult(boolean success,String code,String message){
        this(success);
        this.code=code;
        this.message=message;
    }
}
