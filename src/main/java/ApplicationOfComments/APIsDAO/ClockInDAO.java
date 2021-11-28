package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.POSTs;
import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type Clock in dao.
 * @author 竑也
 */
@Repository
public class ClockInDAO {
    /**
     * The Jdbc template.
     */
    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * Check in teaching pos ts.
     *
     * @param nickname the nickname
     * @return the pos ts
     */
    public POSTs CheckInTeaching(String nickname) {
        String sql = "select * from sportapp.post_teaching where  nickname = ? and TO_DAYS(time) = TO_DAYS(now());";
        List<POSTs> list = jdbcTemplate.query(sql, new Object[]{nickname}, new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * Check in arts pos ts.
     *
     * @param nickname the nickname
     * @return the pos ts
     */
    public POSTs CheckInArts(String nickname) {
        String sql = "select * from sportapp.post_arts where  nickname = ? and TO_DAYS(time) = TO_DAYS(now());";
        List<POSTs> list = jdbcTemplate.query(sql, new Object[]{nickname}, new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * Check in sport pos ts.
     *
     * @param nickname the nickname
     * @return the pos ts
     */
    public POSTs CheckInSport(String nickname) {
        String sql = "select * from sportapp.post_sport where  nickname = ? and TO_DAYS(time) = TO_DAYS(now());";
        List<POSTs> list = jdbcTemplate.query(sql, new Object[]{nickname}, new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
}
