package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.PostOfArtsDAO;
import ApplicationOfComments.Model.POSTs;
import ApplicationOfComments.Model.PostGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Post of arts service.
 */
@Service
public class PostOfArtsService {
    /**
     * The Pos ts dao.
     */
    @Autowired
    PostOfArtsDAO posTsDAO;

    /**
     * Add int.
     *
     * @param posTs the pos ts
     * @return the int
     */
    public int add(POSTs posTs){
        return posTsDAO.addcomment(posTs);
    }

    /**
     * Update int.
     *
     * @param posTs the pos ts
     * @return the int
     */
    public int update(POSTs posTs){
        return posTsDAO.updatecomment(posTs);
    }

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    public int delete(String id){
        return posTsDAO.deletecomment(id);
    }

    /**
     * Get pos ts.
     *
     * @param id the id
     * @return the pos ts
     */
    public POSTs get(String id){
        return posTsDAO.getcoment(id);
    }

    /**
     * Getlist list.
     *
     * @return the list
     */
    public List<POSTs> getlist(){
        return posTsDAO.list();
    }

    /**
     * Add goods int.
     *
     * @param postGoods the post goods
     * @return the int
     */
    public int addGoods(PostGoods postGoods){
        return posTsDAO.addGoods(postGoods);
    }

    /**
     * Delete goods int.
     *
     * @param postGoods the post goods
     * @return the int
     */
    public int deleteGoods(PostGoods postGoods){
        return posTsDAO.deleteGoods(postGoods);
    }

    /**
     * Get goods post goods.
     *
     * @param post_id the post id
     * @param user_id the user id
     * @return the post goods
     */
    public PostGoods getGoods(String post_id,String user_id){
        return posTsDAO.getGoods(post_id,user_id);
    }
}
