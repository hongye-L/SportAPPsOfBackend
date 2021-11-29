package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.PostsOfSportDAO;
import ApplicationOfComments.Model.POSTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Post of sport service.
 */
@Service
public class PostOfSportService {
    /**
     * The Pos ts dao.
     */
    @Autowired
    PostsOfSportDAO posTsDAO;

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
}
