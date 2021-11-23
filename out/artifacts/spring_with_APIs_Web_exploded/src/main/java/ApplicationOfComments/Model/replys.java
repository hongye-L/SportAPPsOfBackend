package ApplicationOfComments.Model;

public class replys {
    private String time;
    private int reply_id;
    private String nickname;
    private String content;
    private int parent_id;
    public replys(){}
    public replys(String time,int reply_id,String nickname,String content,int parent_id){
        this.time=time;
        this.reply_id=reply_id;
        this.nickname=nickname;
        this.content=content;
        this.parent_id=parent_id;
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

}
