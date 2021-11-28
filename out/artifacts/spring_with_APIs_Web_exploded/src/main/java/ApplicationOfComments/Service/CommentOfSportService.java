package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.CommentsOfSportDao;
import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Comment of sport service.
 */
@Service
public class CommentOfSportService {
    /**
     * The Comment dao.
     */
    @Autowired
    CommentsOfSportDao commentDAO;

    /**
     * Add int.
     *
     * @param comment the comment
     * @return the int
     */
    public int add(comments comment){
        return commentDAO.addcomment(comment);
    }

    /**
     * Update int.
     *
     * @param comment the comment
     * @return the int
     */
    public int update(comments comment){
        return commentDAO.updatecomment(comment);
    }

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    public int delete(String id){
        return commentDAO.deletecomment(id);
    }

    /**
     * Get comments.
     *
     * @param id the id
     * @return the comments
     */
    public comments get(String id){
        return commentDAO.getcoment(id);
    }

    /**
     * Getlist list.
     *
     * @return the list
     */
    public List<comments> getlist(){
        return commentDAO.list();
    }

    /**
     * Comments list list.
     *
     * @param post_id the post id
     * @return the list
     */
    public List<comments> commentsList(int post_id){
        return commentDAO.listComment(post_id);
    }
}
