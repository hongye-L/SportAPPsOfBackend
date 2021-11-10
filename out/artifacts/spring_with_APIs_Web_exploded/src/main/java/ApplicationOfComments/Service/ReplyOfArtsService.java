package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.ReplysOfSportDAO;
import ApplicationOfComments.Model.replys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReplyOfArtsService {
    @Autowired
    private ReplysOfSportDAO replysDAO;

    public int add(replys replys){
        return replysDAO.addReply(replys);
    }
    public int update(replys replys){
        return replysDAO.updateReply(replys);
    }
    public int delete(String id){
        return replysDAO.deletereplys(id);
    }
    public replys get(String id){
        return replysDAO.getreplys(id);
    }
    public List<replys> getlist(){
        return replysDAO.list();
    }
    public List<replys> replysList(int parent_id){
        return replysDAO.listReply(parent_id);
    }
}
