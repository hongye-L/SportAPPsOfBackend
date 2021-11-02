package ApplicationOfComments.Model;

public class comments {
    private String id;
    private String name;
    private String comment;
    private int parent_id;
    private int blank_id;
    public comments(){}
    public comments(int blank_id,String id, String name, String comment,int parent_id){
        this.id=id;
        this.name=name;
        this.comment=comment;
        this.blank_id=blank_id;
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

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public void setBlank_id(int blank_id) {
        this.blank_id = blank_id;
    }

    public int getBlank_id() {
        return blank_id;
    }
    @Override
    public String toString()
    {
        return this.getClass().getName()+"{blank_id:"+blank_id+"id:"+id+";name:"+name+" comment:"+comment+"parent_id"+parent_id+"}";
    }
}
