package ApplicaionOfVideos.DAO;

import ApplicaionOfVideos.Model.Videos;
import ApplicationOfPictures.Model.Pictures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class VideoDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addVideos(Videos videos){
        String sql="insert into mysql.video(id,name,video) values(:id,:name,:video)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(videos));
    }
    public int updateVideos(Videos videos) {
        String sql = "update mysql.video set video=:video,name=:name  where id=:id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(videos));
    }
    public int deleteVideos (int id){
        String sql="delete from mysql.video where id=?";
        return jdbcTemplate.update(sql,id);
    }
    public Videos getVideos(int id){
        String sql="select * from mysql.video where id = ?";
        List<Videos> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(Pictures.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<Videos> list()
    {
        String sql="select * from mysql.video";
        List<Videos> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Videos.class));
        return list;
    }
}
