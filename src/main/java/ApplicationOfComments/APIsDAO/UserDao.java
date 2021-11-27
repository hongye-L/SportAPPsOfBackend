package ApplicationOfComments.APIsDAO;

import ApplicationOfComments.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The type User dao.
 */
@Repository
public class UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Get by username users.
     *
     * @param username the username
     * @param password the password
     * @return the users
     */
    public Users getByUsername(String username,String password){
        List<Users> list=jdbcTemplate.query("select * from sportapp.users where username = ? and password=?",new Object[]{username,password}, new BeanPropertyRowMapper(Users.class));
        return list.size()>0 ? list.get(0) : null;
    }

    /**
     * Add users int.
     *
     * @param users the users
     * @return the int
     */
    public int addUsers(Users users){
        String sql="insert into sportapp.users(nickname, username, password) values(:nickname,:username,:password)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(users));
    }

    /**
     * Userlist users.
     *
     * @param username the username
     * @return the users
     */
    public Users userlist(String username){
        String sql="select * from sportapp.users where username=?";
        List<Users> list =jdbcTemplate.query(sql,new Object[]{username},new BeanPropertyRowMapper(Users.class));
        return list.size() > 0 ? list.get(0) : null;
    }
}