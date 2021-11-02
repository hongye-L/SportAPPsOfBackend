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
public class CommentsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addComments(comments comments){
        String sql="insert into sportapp.comment(blank_id,id,name,comment,parent_id) values(:blank_id,:id,:name,:comment,:parent_id)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(comments));
    }
    public int updateComments(comments comments) {
        String sql = "update sportapp.comment set comment=:comment,name=:name  where id=:id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(comments));
    }
    public int deleteComments (String id){
        String sql="delete from sportapp.comment where id=?";
        return jdbcTemplate.update(sql,id);
    }
    public comments getComments(String id){
        String sql="select * from sportapp.comment where id = ?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public comments getParentComments(int blank_id){
        String sql="select * from sportapp.comment where parent_id <0 and blank_id=?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{blank_id},new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public comments getSonComments(int blank_id,int id){
        String sql="select * from sportapp.comment where parent_id >0 and blank_id=? and id=?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{blank_id,id},new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<comments> list()
    {
        String sql="select * from sportapp.comment";
        List<comments> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(comments.class));
        return list;
    }
    public List<comments> listOfBlank(int blank_id){
        String sql="select * from sportapp.comment where blank_id=?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{blank_id},new BeanPropertyRowMapper(comments.class));
        return list;
    }
}
