package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.replys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Reply of arts dao.
 * @author 竑也
 */
@Repository
public class ReplyOfArtsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Add reply int.
     *
     * @param replys the replys
     * @return the int
     */
    public int addReply(replys replys){
        String sql="insert into sportapp.reply_arts(reply_id,nickname,content,comment_id,parent_id) values(:reply_id,:nickname,:content,:parent_id,:comment_id)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(replys));
    }

    /**
     * Update reply int.
     *
     * @param replys the replys
     * @return the int
     */
    public int updateReply(replys replys) {
        String sql = "update sportapp.reply_arts set content=:content  where reply_id=:reply_id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(replys));
    }

    /**
     * Deletereplys int.
     *
     * @param id the id
     * @return the int
     */
    public int deletereplys (String id){
        String sql="delete from sportapp.reply_arts where reply_id=?";
        return jdbcTemplate.update(sql,id);
    }

    /**
     * Getreplys replys.
     *
     * @param id the id
     * @return the replys
     */
    public replys getreplys(String id){
        String sql="select * from sportapp.reply_arts where reply_id = ?";
        List<replys> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(replys.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * List list.
     *
     * @return the list
     */
    public List<replys> list()
    {
        String sql="select * from sportapp.reply_arts";
        List<replys> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(replys.class));
        return list;
    }

    /**
     * List reply list.
     *
     * @param parent_id the parent id
     * @return the list
     */
    public List<replys> listReply(int parent_id)
    {
        String sql="select * from sportapp.reply_sport where comment_id=?";
        List<replys> list =jdbcTemplate.query(sql,new Object[]{parent_id},new BeanPropertyRowMapper(replys.class));
        return list;
    }
}
