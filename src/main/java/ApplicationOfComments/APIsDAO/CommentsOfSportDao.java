package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentsOfSportDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addcomment(comments comments){
        String sql="insert into sportapp.comment_sport(comment_id,nickname,content,floor,post_id) values(:reply_id,:nickname,:content,:floor,:post_id)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(comments));
    }
    public int updatecomment(comments comments) {
        String sql = "update sportapp.comment_sport set content=:comment,nickname=:name  where comment_id=:id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(comments));
    }
    public int deletecomment (String id){
        String sql="delete from sportapp.comment_sport where comment_id=?";
        return jdbcTemplate.update(sql,id);
    }
    public comments getcoment(String id){
        String sql="select * from sportapp.comment_sport where  comment_id = ?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<comments> list()
    {
        String sql="select * from sportapp.comment_sport";
        List<comments> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(comments.class));
        return list;
    }
    public List<comments> listReply(int post_id)
    {
        String sql="select * from sportapp.reply_sport where parent_id=?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{post_id},new BeanPropertyRowMapper(comments.class));
        return list;
    }
}
