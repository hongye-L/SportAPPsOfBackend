package ApplicationOfComments.Model;

/**
 * The type replys.
 * @author 竑也
 */
public class replys {
    private String time;
    private String reply_id;
    private String nickname;
    private String content;
    private String parent_id;

    /**
     * Instantiates a new Replys.
     */
    public replys(){}

    /**
     * Instantiates a new Replys.
     *
     * @param time      the time
     * @param reply_id  the reply id
     * @param nickname  the nickname
     * @param content   the content
     * @param parent_id the parent id
     */
    public replys(String time, String reply_id, String nickname, String content, String parent_id){
        this.time=time;
        this.reply_id=reply_id;
        this.nickname=nickname;
        this.content=content;
        this.parent_id=parent_id;
    }


    /**
     * Gets time.
     *
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Sets reply id.
     *
     * @param reply_id the reply id
     */
    public void setReply_id(String reply_id) {
        this.reply_id = reply_id;
    }

    /**
     * Gets reply id.
     *
     * @return the reply id
     */
    public String getReply_id() {
        return reply_id;
    }

    /**
     * Sets content.
     *
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Sets parent id.
     *
     * @param parent_id the parent id
     */
    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * Gets parent id.
     *
     * @return the parent id
     */
    public String getParent_id() {
        return parent_id;
    }

}
