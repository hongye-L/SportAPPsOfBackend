package ApplicationOfComments.Model;

public class comments {
    private String id;
    private String nickname;
    private String content;
    private int floor;
    private int goods;
    private int replys;
    private String time;
    private String user_avatar;
    private int post_id;
    public comments(){}
    public comments(String id, String name, String content, String time, String user_avatar,int post_id,int floor,int goods,int replys){
        this.id=id;
        this.nickname=name;
        this.content=content;
        this.time=time;
        this.user_avatar=user_avatar;
        this.post_id=post_id;
        this.floor=floor;
        this.goods=goods;
        this.replys=replys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return nickname;
    }

    public void setName(String name) {
        this.nickname = name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setReplys(int replys) {
        this.replys = replys;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getReplys() {
        return replys;
    }

    public int getGoods() {
        return goods;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+"nickname:"+nickname+"content:"+content+"time:"+time+"}";
    }
}
