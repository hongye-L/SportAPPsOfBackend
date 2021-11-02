package ApplicationOfPictures.DAO;

import ApplicationOfPictures.Model.Pictures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PicturesDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addPictures(Pictures pictures){
        String sql="insert into mysql.pictures(id,name,picture) values(:id,:name,:picture)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(pictures));
    }
    public int updatePictures(Pictures pictures) {
        String sql = "update mysql.pictures set picture=:picture,name=:name  where id=:id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(pictures));
    }
    public int deletePictures (int id){
        String sql="delete from mysql.pictures where id=?";
        return jdbcTemplate.update(sql,id);
    }
    public Pictures getPictures(int id){
        String sql="select * from mysql.pictures where id = ?";
        List<Pictures> list =jdbcTemplate.query(sql,new Object[]{id},new BeanPropertyRowMapper(Pictures.class));
        //判断list里面有没有东西
        return list.size() > 0 ? list.get(0) : null;
    }
    public List<Pictures> list()
    {
        String sql="select * from mysql.pictures";
        List<Pictures> list =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Pictures.class));
        return list;
    }
}
