package ApplicationOfPictures.Service;

import ApplicationOfPictures.DAO.PicturesDAO;
import ApplicationOfPictures.Model.Pictures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PicturesService {
    @Autowired
    private PicturesDAO picturesDAO;

    public int add(Pictures pictures){
        return picturesDAO.addPictures(pictures);
    }
    public int update(Pictures pictures){
        return picturesDAO.updatePictures(pictures);
    }
    public int delete(int id){
        return picturesDAO.deletePictures(id);
    }
    public Pictures get(int id){
        return picturesDAO.getPictures(id);
    }
    public List<Pictures> getlist(){
        return picturesDAO.list();
    }
}
