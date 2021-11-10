package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.CommentsOfSportDao;
import ApplicationOfComments.Model.comments;
import ApplicationOfComments.Model.replys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentOfSportService {
    @Autowired
    CommentsOfSportDao commentDAO;
    public int add(comments comment){
        return commentDAO.addcomment(comment);
    }
    public int update(comments comment){
        return commentDAO.updatecomment(comment);
    }
    public int delete(String id){
        return commentDAO.deletecomment(id);
    }
    public comments get(String id){
        return commentDAO.getcoment(id);
    }
    public List<comments> getlist(){
        return commentDAO.list();
    }
    public List<comments> commentsList(int post_id){
        return commentDAO.listReply(post_id);
    }
}
