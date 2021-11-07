    package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.UserDao;
import ApplicationOfComments.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
public class UserService {

        @Autowired
        private UserDao userDao;

        public Users getByUsername(String username,String password){
            return userDao.getByUsername(username,password);
        }
        public int add(Users users){
            return userDao.addUsers(users);
        }
        public Users list(String username){
            return userDao.userlist(username);
        }
}
