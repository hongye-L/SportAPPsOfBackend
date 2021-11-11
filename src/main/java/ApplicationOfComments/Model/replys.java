package ApplicationOfComments.Model;

public class replys {
    private String id;
    private String name;
    private String comment;
    private String time;
    private int reply_id;
    private String nickname;
    private String content;
    private int parent_id;
    public replys(){}
    public replys(String id, String name, String comment,String time,int reply_id,String nickname,String content,int parent_id){
        this.id=id;
        this.name=name;
        this.comment=comment;
        this.time=time;
        this.reply_id=reply_id;
        this.nickname=nickname;
        this.content=content;
        this.parent_id=parent_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public String getNickname() {
        return nickname;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public int getParent_id() {
        return parent_id;
    }

    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+"name:"+name+"comment:"+comment+"time:"+time+"}";
    }
}
