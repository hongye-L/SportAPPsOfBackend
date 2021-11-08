package ApplicationOfComments.Model;

public class comments {
    private String id;
    private String nickname;
    private String comment;
    private String time;
    private String user_avatar;
    public comments(){}
    public comments(String id, String name, String comment, String time, String user_avatar){
        this.id=id;
        this.nickname=name;
        this.comment=comment;
        this.time=time;
        this.user_avatar=user_avatar;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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


    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+"nickname:"+nickname+"comment:"+comment+"time:"+time+"}";
    }
}
