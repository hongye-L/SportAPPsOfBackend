package ApplicationOfComments.Model;

/**
 * The type Comments.
 * @author 竑也
 */
public class comments {
    private String id;
    private String nickname;
    private String content;
    private String floor;
    private String goods;
    private String replys;
    private String time;
    private String user_avatar;
    private String post_id;
    private String comment_id;

    /**
     * Instantiates a new Comments.
     */
    public comments(){}

    /**
     * Instantiates a new Comments.
     *
     * @param id          the id
     * @param name        the name
     * @param content     the content
     * @param time        the time
     * @param user_avatar the user avatar
     * @param post_id     the post id
     * @param floor       the floor
     * @param goods       the goods
     * @param comment_id  the comment id
     */
    public comments(String id, String name, String content, String time, String user_avatar,String post_id,String floor,String goods,String comment_id){
        this.id=id;
        this.nickname=name;
        this.content=content;
        this.time=time;
        this.user_avatar=user_avatar;
        this.post_id=post_id;
        this.floor=floor;
        this.goods=goods;
        this.comment_id=comment_id;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return nickname;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.nickname = name;
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
     * Gets user avatar.
     *
     * @return the user avatar
     */
    public String getUser_avatar() {
        return user_avatar;
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
     * Sets user avatar.
     *
     * @param user_avatar the user avatar
     */
    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
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
     * Sets post id.
     *
     * @param post_id the post id
     */
    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    /**
     * Gets post id.
     *
     * @return the post id
     */
    public String getPost_id() {
        return post_id;
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
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets replys.
     *
     * @param replys the replys
     */
    public void setReplys(String replys) {
        this.replys = replys;
    }

    /**
     * Sets goods.
     *
     * @param goods the goods
     */
    public void setGoods(String goods) {
        this.goods = goods;
    }

    /**
     * Sets floor.
     *
     * @param floor the floor
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * Gets replys.
     *
     * @return the replys
     */
    public String getReplys() {
        return replys;
    }

    /**
     * Gets goods.
     *
     * @return the goods
     */
    public String getGoods() {
        return goods;
    }

    /**
     * Gets floor.
     *
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+"nickname:"+nickname+"content:"+content+"time:"+time+"}";
    }
}
