package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.POSTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PostOfTeachingDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addcomment(POSTs posTs){
        String sql="insert into sportapp.post_teaching(post_id,nickname,content,post_id,post_title,picture_1" +
                ",picture_2,picture_3,picture_4,picture_5,picture_6,goods) " +
                "values(:reply_id,:nickname,:content,:post_id,:post_title,:picture_1,:picture_2" +
                ",:picture_3,:picture_4,:picture_5,:picture_6,:goods)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(posTs));
    }
    public int updatecomment(POSTs posTs) {
        String sql = "update sportapp.post_teaching set content=:comment,nickname=:name where post_id=:id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(posTs));
    }
    public int deletecomment (String id){
        String sql="delete from sportapp.post_teaching where post_id=?";
        return jdbcTemplate.update(sql,id);
    }
    public POSTs getcoment(String id){
        String sql="select * from sportapp.post_teaching where  post_id = ?";
        List<POSTs> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(POSTs.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<POSTs> list()
    {
        String sql="select * from sportapp.post_teaching";
        List<POSTs> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(POSTs.class));
        return list;
    }
}
