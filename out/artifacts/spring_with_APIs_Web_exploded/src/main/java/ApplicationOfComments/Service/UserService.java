    package ApplicationOfComments.Service;

import ApplicationOfComments.APIsDAO.UserDao;
import ApplicationOfComments.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

        @Autowired
        private UserDao userDao;

        public Users getByUsername(String username){
            return userDao.getByUsername(username);
        }
}
