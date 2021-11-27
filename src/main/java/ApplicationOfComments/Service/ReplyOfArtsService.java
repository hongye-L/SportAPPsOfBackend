package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.ReplyOfArtsDAO;
import ApplicationOfComments.Model.replys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Reply of arts service.
 */
@Service
public class ReplyOfArtsService {
    @Autowired
    private ReplyOfArtsDAO replysDAO;

    /**
     * Add int.
     *
     * @param replys the replys
     * @return the int
     */
    public int add(replys replys){
        return replysDAO.addReply(replys);
    }

    /**
     * Update int.
     *
     * @param replys the replys
     * @return the int
     */
    public int update(replys replys){
        return replysDAO.updateReply(replys);
    }

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    public int delete(String id){
        return replysDAO.deletereplys(id);
    }

    /**
     * Get replys.
     *
     * @param id the id
     * @return the replys
     */
    public replys get(String id){
        return replysDAO.getreplys(id);
    }

    /**
     * Getlist list.
     *
     * @return the list
     */
    public List<replys> getlist(){
        return replysDAO.list();
    }

    /**
     * Replys list list.
     *
     * @param parent_id the parent id
     * @return the list
     */
    public List<replys> replysList(int parent_id){
        return replysDAO.listReply(parent_id);
    }
}
