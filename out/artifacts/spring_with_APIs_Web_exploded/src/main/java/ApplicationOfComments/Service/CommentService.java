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
    public int delete(int id){
        return commentsDao.deleteComments(id);
    }
    public comments get(int id){
        return commentsDao.getComments(id);
    }
    public List<comments> getlist(){
        return commentsDao.list();
    }
}
