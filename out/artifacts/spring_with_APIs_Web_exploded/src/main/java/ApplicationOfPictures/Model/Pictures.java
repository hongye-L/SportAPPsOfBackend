package ApplicationOfPictures.Model;


public class Pictures {
    private int id;
    private String name;
    private String Picture;
    public Pictures(){}
    public Pictures(int id, String name, String picture){
        this.id=id;
        this.name=name;
        this.Picture=picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String picture) {
        this.Picture = picture;
    }
    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+";name:"+name+" Pictures:"+Picture+"}";
    }
}
