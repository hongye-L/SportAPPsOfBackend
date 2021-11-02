package ApplicaionOfVideos.Service;

import ApplicaionOfVideos.DAO.VideoDAO;
import ApplicaionOfVideos.Model.Videos;
import ApplicationOfPictures.DAO.PicturesDAO;
import ApplicationOfPictures.Model.Pictures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoService {
    @Autowired
    private VideoDAO videoDAO;

    public int add(Videos videos){
        return videoDAO.addVideos(videos);
    }
    public int update(Videos videos){
        return videoDAO.updateVideos(videos);
    }
    public int delete(int id){
        return videoDAO.deleteVideos(id);
    }
    public Videos get(int id){
        return videoDAO.getVideos(id);
    }
    public List<Videos> getlist(){
        return videoDAO.list();
    }
}
