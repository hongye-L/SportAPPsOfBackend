package ApplicationOfComments.Model;

public class replys {
    private String id;
    private String name;
    private String comment;
    private String time;
    public replys(){}
    public replys(String id, String name, String comment,String time){
        this.id=id;
        this.name=name;
        this.comment=comment;
        this.time=time;
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


    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+"name:"+name+"comment:"+comment+"time:"+time+"}";
    }
}
