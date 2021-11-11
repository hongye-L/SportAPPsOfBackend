package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.POSTs;
import ApplicationOfComments.Model.comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ClockInDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    public POSTs CheckInTeaching(String nickname) {
        String sql = "select * from sportapp.post_teaching where  nickname = ? and TO_DAYS(time) = TO_DAYS(now());";
        List<POSTs> list = jdbcTemplate.query(sql, new Object[]{nickname}, new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public POSTs CheckInArts(String nickname) {
        String sql = "select * from sportapp.post_arts where  nickname = ? and TO_DAYS(time) = TO_DAYS(now());";
        List<POSTs> list = jdbcTemplate.query(sql, new Object[]{nickname}, new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public POSTs CheckInSport(String nickname) {
        String sql = "select * from sportapp.post_sport where  nickname = ? and TO_DAYS(time) = TO_DAYS(now());";
        List<POSTs> list = jdbcTemplate.query(sql, new Object[]{nickname}, new BeanPropertyRowMapper(comments.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
}
