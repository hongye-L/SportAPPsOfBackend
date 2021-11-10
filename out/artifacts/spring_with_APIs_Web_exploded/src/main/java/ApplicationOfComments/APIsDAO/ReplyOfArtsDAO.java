package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.comments;
import ApplicationOfComments.Model.replys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ReplyOfArtsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addReply(replys replys){
        String sql="insert into sportapp.reply_arts(reply_id,nickname,content) values(:reply_id,:nickname,:content)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(replys));
    }
    public int updateReply(replys replys) {
        String sql = "update sportapp.reply_arts set content=:comment,nickname=:name  where reply_id=:id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(replys));
    }
    public int deletereplys (String id){
        String sql="delete from sportapp.reply_arts where reply_id=?";
        return jdbcTemplate.update(sql,id);
    }
    public replys getreplys(String id){
        String sql="select * from sportapp.reply_arts where reply_id = ?";
        List<replys> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(replys.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<replys> list()
    {
        String sql="select * from sportapp.reply_arts";
        List<replys> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(replys.class));
        return list;
    }
    public List<replys> listReply(int parent_id)
    {
        String sql="select * from sportapp.reply_sport where parent_id=?";
        List<replys> list =jdbcTemplate.query(sql,new Object[]{parent_id},new BeanPropertyRowMapper(replys.class));
        return list;
    }
}
