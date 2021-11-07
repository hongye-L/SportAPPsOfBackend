package ApplicationOfComments.Model;

public class Users {
    private String username;
    private String password;
    private int user_id;
    private String nickname;
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return this.getClass().getName()+"{user_id:"+user_id+"nickname:"+nickname+"username"+username+"password"+password+"}";
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}
