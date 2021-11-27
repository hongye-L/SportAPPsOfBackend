    package ApplicationOfComments.Service;

    import ApplicationOfComments.APIsDAO.UserDao;
    import ApplicationOfComments.Model.Users;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    /**
     * The type User service.
     */
    @Service
public class UserService {

        @Autowired
        private UserDao userDao;

        /**
         * Get by username users.
         *
         * @param username the username
         * @param password the password
         * @return the users
         */
        public Users getByUsername(String username,String password){
            return userDao.getByUsername(username,password);
        }

        /**
         * Add int.
         *
         * @param users the users
         * @return the int
         */
        public int add(Users users){
            return userDao.addUsers(users);
        }

        /**
         * List users.
         *
         * @param username the username
         * @return the users
         */
        public Users list(String username){
            return userDao.userlist(username);
        }
}
