    package ApplicationOfComments.Service;

    import ApplicationOfComments.APIsDAO.UserDao;
    import ApplicationOfComments.Model.Users;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    /**
     * The type User service.
     * @author 竑也
     */
    @Service
public class UserService {

        @Autowired
        private UserDao userDao;

        /**
         * Get by username users.
         *
         * @param user_Id the userId
         * @param password the password
         * @return the users
         */
        public Users getByUsername(String user_Id, String password){
            return userDao.getByUsername(user_Id,password);
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
        public int updateUsers(Users users){return userDao.updateUsers(users);}
}
