package ApplicationOfComments.Model;

/**
 * The type Users.
 */
public class Users {
    private String username;
    private String password;
    private String user_Id;
    private String nickname;
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
        return this.getClass().getName()+"{user_id:"+user_Id+"nickname:"+username+"username"+username+"password"+password+"}";
    }
    public Users(String user_name,String password,String user_id){
        this.username=user_name;
        this.user_Id=user_id;
        this.password=password;
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
        return user_Id;
    }

    /**
     * Sets user id.
     *
     * @param user_id the user id
     */
    public void setUser_id(String user_id) {
        this.user_Id = user_id;
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
