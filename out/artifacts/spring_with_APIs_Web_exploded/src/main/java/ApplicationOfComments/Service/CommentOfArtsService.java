package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.CommentOfArtsDAO;
import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentOfArtsService {
    @Autowired
    CommentOfArtsDAO commentDAO;
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
        return commentDAO.listComment(post_id);
    }
}
