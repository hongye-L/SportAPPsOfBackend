package ApplicationOfComments.Util;

import net.sf.json.JSONObject;

/**
 * The type Return message.
 */
public class ReturnMessage {
    private ReturnMessage() {
    }

    /**
     * Success json object.
     *
     * @return the json object
     */
    public static JSONObject success() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(DemoConstants.CODE, "1");
        jsonObject.put(DemoConstants.MESSAGE, "SUCCESS");

        return jsonObject;
    }

    /**
     * Create return message json object.
     *
     * @param code    the code
     * @param message the message
     * @return the json object
     */
    public static JSONObject createReturnMessage(String code, String message) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(DemoConstants.CODE, code);
        jsonObject.put(DemoConstants.MESSAGE, message);
        return jsonObject;
    }

    /**
     * Create return message json object.
     *
     * @param code    the code
     * @param message the message
     * @param data    the data
     * @return the json object
     */
    public static JSONObject createReturnMessage(String code, String message, Object data) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(DemoConstants.CODE, code);
        jsonObject.put(DemoConstants.MESSAGE, message);
        jsonObject.put(DemoConstants.DATA, data);

        return jsonObject;
    }
}
