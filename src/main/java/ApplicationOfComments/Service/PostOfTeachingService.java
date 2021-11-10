package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.PostOfTeachingDAO;
import ApplicationOfComments.Model.POSTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostOfTeachingService {
    @Autowired
    PostOfTeachingDAO posTsDAO;
    public int add(POSTs posTs){
        return posTsDAO.addcomment(posTs);
    }
    public int update(POSTs posTs){
        return posTsDAO.updatecomment(posTs);
    }
    public int delete(String id){
        return posTsDAO.deletecomment(id);
    }
    public POSTs get(String id){
        return posTsDAO.getcoment(id);
    }
    public List<POSTs> getlist(){
        return posTsDAO.list();
    }
}
