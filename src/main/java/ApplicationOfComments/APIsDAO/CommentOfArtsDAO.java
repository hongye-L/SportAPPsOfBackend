package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Comment of arts dao.
 */
@Repository
public class CommentOfArtsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Addcomment int.
     *
     * @param comments the comments
     * @return the int
     */
    public int addcomment(comments comments){
        String sql="insert into sportapp.comment_arts(nickname,content,post_id) values(:nickname,:content,:post_id)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(comments));
    }

    /**
     * Updatecomment int.
     *
     * @param comments the comments
     * @return the int
     */
    public int updatecomment(comments comments) {
        String sql = "update sportapp.comment_arts set content=:content where comment_id=:comment_id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(comments));
    }

    /**
     * Deletecomment int.
     *
     * @param id the id
     * @return the int
     */
    public int deletecomment (String id){
        String sql="delete from sportapp.comment_arts where comment_id=?";
        return jdbcTemplate.update(sql,id);
    }

    /**
     * Getcoment comments.
     *
     * @param id the id
     * @return the comments
     */
    public comments getcoment(String id){
        String sql="select * from sportapp.comment_arts where  comment_id = ?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * List list.
     *
     * @return the list
     */
    public List<comments> list()
    {
        String sql="select * from sportapp.comment_arts";
        List<comments> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(comments.class));
        return list;
    }

    /**
     * List comment list.
     *
     * @param post_id the post id
     * @return the list
     */
    public List<comments> listComment(int post_id)
    {
        String sql="select * from sportapp.comment_arts where post_id=?";
        List<comments> list =jdbcTemplate.query(sql,new Object[]{post_id},new BeanPropertyRowMapper(comments.class));
        return list;
    }
}
