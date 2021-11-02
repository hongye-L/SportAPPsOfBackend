package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public Users getByUsername(String username){
        List<Users> list=jdbcTemplate.query("select * from mysql.table_user where username = ?",new Object[]{username}, new BeanPropertyRowMapper(Users.class));
        return list.size()>0 ? list.get(0) : null;
    }
}