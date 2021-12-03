package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.POSTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Pos ts of sport dao.
 * @author 竑也
 */
@Repository
public class PostsOfSportDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Addcomment int.
     *
     * @param posTs the pos ts
     * @return the int
     */
    public int addcomment(POSTs posTs){
        String sql="insert into sportapp.post_sport(post_id,nickname,user_avatar,content,post_title,picture_1" +
                ",picture_2,picture_3,picture_4,picture_5,picture_6,goods,videos) " +
                "values(:post_id,:nickname,:user_avatar,:content,:post_title,:picture_1,:picture_2" +
                ",:picture_3,:picture_4,:picture_5,:picture_6,:goods,:videos)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(posTs));
    }

    /**
     * Updatecomment int.
     *
     * @param posTs the pos ts
     * @return the int
     */
    public int updatecomment(POSTs posTs) {
        String sql = "update sportapp.post_sport set content=:content where post_id=:post_id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(posTs));
    }

    /**
     * Deletecomment int.
     *
     * @param id the id
     * @return the int
     */
    public int deletecomment (String id){
        String sql="delete from sportapp.post_sport where post_id=?";
        return jdbcTemplate.update(sql,id);
    }

    /**
     * Getcoment pos ts.
     *
     * @param id the id
     * @return the pos ts
     */
    public POSTs getcoment(String id){
        String sql="select * from sportapp.post_sport where  post_id = ?";
        List<POSTs> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(POSTs.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * List list.
     *
     * @return the list
     */
    public List<POSTs> list()
    {
        String sql="select * from sportapp.post_sport";
        List<POSTs> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(POSTs.class));
        return list;
    }
}
