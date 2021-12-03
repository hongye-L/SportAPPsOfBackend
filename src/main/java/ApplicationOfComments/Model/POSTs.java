package ApplicationOfComments.Model;

/**
 * The type Pos ts.
 * @author 竑也
 */
public class POSTs {
    private int post_id;
    private String nickname;
    private String user_avatar;
    private String time;
    private String post_title;
    private String content;
    private String picture_1;
    private String picture_2;
    private String picture_3;
    private String picture_4;
    private String picture_5;
    private String picture_6;
    private Boolean goods;
    private Integer replys;
    private String videos;
    /**
     * Instantiates a new Pos ts.
     *
     * @param post_id     the post id
     * @param nickname    the nickname
     * @param user_avatar the user avatar
     * @param time        the time
     * @param post_title  the post title
     * @param content     the content
     * @param picture_1   the picture 1
     * @param picture_2   the picture 2
     * @param picture_3   the picture 3
     * @param picture_4   the picture 4
     * @param picture_5   the picture 5
     * @param picture_6   the picture 6
     * @param goods       the goods
     * @param replys      the replys
     */
    public POSTs(int post_id, String nickname, String user_avatar, String time, String post_title, String content,
                 String picture_1, String picture_2, String picture_3,
                 String picture_4, String picture_5, String picture_6, Boolean goods, Integer replys, String videos){
        this.post_id=post_id;
        this.nickname=nickname;
        this.user_avatar=user_avatar;
        this.time=time;
        this.post_title=post_title;
        this.content=content;
        this.picture_1=picture_1;
        this.picture_2=picture_2;
        this.picture_3=picture_3;
        this.picture_4=picture_4;
        this.picture_5=picture_5;
        this.picture_6=picture_6;
        this.goods=goods;
        this.replys=replys;
        this.videos=videos;
    }

    /**
     * Instantiates a new Pos ts.
     */
    public POSTs(){}

    /**
     * Gets post id.
     *
     * @return the post id
     */
    public int getPost_id() {
        return post_id;
    }

    /**
     * Sets post id.
     *
     * @param post_id the post id
     */
    public void setPost_id(int post_id) {
        this.post_id = post_id;
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
     * Sets user avatar.
     *
     * @param user_avatar the user avatar
     */
    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
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
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
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
     * Gets goods.
     *
     * @return the goods
     */
    public Boolean getGoods() {
        return goods;
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
     * Gets replys.
     *
     * @return the replys
     */
    public Integer getReplys() {
        return replys;
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
     * Gets picture 1.
     *
     * @return the picture 1
     */
    public String getPicture_1() {
        return picture_1;
    }

    /**
     * Gets picture 2.
     *
     * @return the picture 2
     */
    public String getPicture_2() {
        return picture_2;
    }

    /**
     * Gets picture 3.
     *
     * @return the picture 3
     */
    public String getPicture_3() {
        return picture_3;
    }

    /**
     * Gets picture 4.
     *
     * @return the picture 4
     */
    public String getPicture_4() {
        return picture_4;
    }

    /**
     * Gets picture 5.
     *
     * @return the picture 5
     */
    public String getPicture_5() {
        return picture_5;
    }

    /**
     * Gets picture 6.
     *
     * @return the picture 6
     */
    public String getPicture_6() {
        return picture_6;
    }

    /**
     * Gets post title.
     *
     * @return the post title
     */
    public String getPost_title() {
        return post_title;
    }

    /**
     * Sets goods.
     *
     * @param goods the goods
     */
    public void setGoods(Boolean goods) {
        this.goods = goods;
    }

    /**
     * Sets picture 1.
     *
     * @param picture_1 the picture 1
     */
    public void setPicture_1(String picture_1) {
        this.picture_1 = picture_1;
    }

    /**
     * Sets picture 2.
     *
     * @param picture_2 the picture 2
     */
    public void setPicture_2(String picture_2) {
        this.picture_2 = picture_2;
    }

    /**
     * Sets picture 3.
     *
     * @param picture_3 the picture 3
     */
    public void setPicture_3(String picture_3) {
        this.picture_3 = picture_3;
    }

    /**
     * Sets picture 4.
     *
     * @param picture_4 the picture 4
     */
    public void setPicture_4(String picture_4) {
        this.picture_4 = picture_4;
    }

    /**
     * Sets picture 5.
     *
     * @param picture_5 the picture 5
     */
    public void setPicture_5(String picture_5) {
        this.picture_5 = picture_5;
    }

    /**
     * Sets picture 6.
     *
     * @param picture_6 the picture 6
     */
    public void setPicture_6(String picture_6) {
        this.picture_6 = picture_6;
    }

    /**
     * Sets post title.
     *
     * @param post_title the post title
     */
    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    /**
     * Sets replys.
     *
     * @param replys the replys
     */
    public void setReplys(Integer replys) {
        this.replys = replys;
    }
    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }
}
