package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.CommentsDao;
import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentsDao commentsDao;

    public int add(comments comments){
        return commentsDao.addComments(comments);
    }
    public int update(comments comments){
        return commentsDao.updateComments(comments);
    }
    public int delete(String id){
        return commentsDao.deleteComments(id);
    }
    public comments get(String id){
        return commentsDao.getComments(id);
    }
    public List<comments> getlist(){
        return commentsDao.list();
    }
    public comments getParentComments(int  blank_id){
        return commentsDao.getParentComments(blank_id);
    }
    public comments getSonComments(int  black_id,int id){
        return commentsDao.getSonComments(black_id,id);
    }
    public List<comments> listOfBlank(int blank_id){
        return commentsDao.listOfBlank(blank_id);
    }
}
