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
 *
 * @author 竑也
 */
@Repository
public class UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Get by username users.
     *
     * @param userid   the userid
     * @param password the password
     * @return the users
     */
    public Users getByUsername(String userid,String password){
        List<Users> list=jdbcTemplate.query("select * from timeapp.infos where user_id = ? and user_password=?",new Object[]{userid,password},
                new BeanPropertyRowMapper(Users.class));
        return list.size()>0 ? list.get(0) : null;
    }

    /**
     * Add users int.
     *
     * @param users the users
     * @return the int
     */
    public int addUsers(Users users){
        String sql="insert into timeapp.infos(user_name,user_id,user_password) values(:user_name,:user_id,:user_password)";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(users));
    }

    /**
     * Userslist users.
     *
     * @param userid the userid
     * @return the users
     */
    public Users userlist(String userid){
        String sql="select * from timeapp.infos where user_id=?";
        List<Users> list =jdbcTemplate.query(sql,new Object[]{userid},new BeanPropertyRowMapper(Users.class));
        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * Update users int.
     *
     * @param users the users
     * @return the int
     */
    public int updatePassword(Users users){
        String sql="update timeapp.infos set user_password=:password where user_id=:user_id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(users));
    }
    public int updateUserAvatar(Users users){
        String sql="update timeapp.infos set user_avatar=:user_avatar where user_id=:user_id";
        return new NamedParameterJdbcTemplate(jdbcTemplate).update(sql,new BeanPropertySqlParameterSource(users));
    }
}