package ApplicaionOfVideos.Model;

public class Videos {
    private int id;
    private String name;
    private String Video;
    public Videos(){}
    public Videos(int id, String name, String video){
        this.id=id;
        this.name=name;
        this.Video=video;
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

    public String getVideo() {
        return Video;
    }

    public void setPicture(String video) {
        this.Video = video;
    }
    @Override
    public String toString()
    {
        return this.getClass().getName()+"{id:"+id+";name:"+name+" Videos:"+Video+"}";
    }
}
