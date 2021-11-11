package ApplicationOfComments.Model;

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
    private int goods;
    private int replys;
    public POSTs(int post_id,String nickname,String user_avatar,String time,String post_title,String content,
                 String picture_1,String picture_2,String picture_3,
                 String picture_4,String picture_5,String picture_6,int goods,int replys){
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
    }
    public POSTs(){}
    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getGoods() {
        return goods;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReplys() {
        return replys;
    }

    public String getContent() {
        return content;
    }

    public String getPicture_1() {
        return picture_1;
    }

    public String getPicture_2() {
        return picture_2;
    }

    public String getPicture_3() {
        return picture_3;
    }

    public String getPicture_4() {
        return picture_4;
    }

    public String getPicture_5() {
        return picture_5;
    }

    public String getPicture_6() {
        return picture_6;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }

    public void setPicture_1(String picture_1) {
        this.picture_1 = picture_1;
    }

    public void setPicture_2(String picture_2) {
        this.picture_2 = picture_2;
    }

    public void setPicture_3(String picture_3) {
        this.picture_3 = picture_3;
    }

    public void setPicture_4(String picture_4) {
        this.picture_4 = picture_4;
    }

    public void setPicture_5(String picture_5) {
        this.picture_5 = picture_5;
    }

    public void setPicture_6(String picture_6) {
        this.picture_6 = picture_6;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
    }

    public void setReplys(int replys) {
        this.replys = replys;
    }
}
