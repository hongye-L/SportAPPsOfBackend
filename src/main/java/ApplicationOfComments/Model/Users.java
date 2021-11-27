package ApplicationOfComments.Model;

/**
 * The type Users.
 */
public class Users {
    private String username;
    private String password;
    private int user_id;
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
        return this.getClass().getName()+"{user_id:"+user_id+"nickname:"+nickname+"username"+username+"password"+password+"}";
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
    public int getUser_id() {
        return user_id;
    }

    /**
     * Sets user id.
     *
     * @param user_id the user id
     */
    public void setUser_id(int user_id) {
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
