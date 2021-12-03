package ApplicationOfComments.Model;

/**
 * The type Users.
 *
 * @author 竑也
 */
public class Users {
    private String username;
    private String password;
    private String user_id;
    private String nickname;
    private String user_avatar;

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return this.getClass().getName()+"{user_id:"+user_id+"nickname:"+username+"username"+username+"password"+password+"user_avatar"+user_avatar+"}";
    }

    /**
     * Instantiates a new Users.
     *
     * @param user_name   the username
     * @param password    the password
     * @param user_id     the user id
     * @param user_avatar the user avatar
     */
    public Users(String user_name,String password,String user_id,String user_avatar){
        this.username=user_name;
        this.user_id=user_id;
        this.password=password;
        this.user_avatar=user_avatar;
    }

    /**
     * Sets user avatar.
     *
     * @param user_avatar the user avatar
     */
    public void setUser_avatar(String user_avatar) {
        this.user_avatar = user_avatar;
    }

    public String getUser_avatar() {
        return user_avatar;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets username.
     *
     * @param username the username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets user id.
     *
     * @return the user id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * Sets user id.
     *
     * @param user_id the user id
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * Sets nickname.
     *
     * @param nickname the nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Gets nickname.
     *
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }
}
