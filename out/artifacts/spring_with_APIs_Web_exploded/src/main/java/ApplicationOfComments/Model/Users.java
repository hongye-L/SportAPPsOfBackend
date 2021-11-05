package ApplicationOfComments.Model;

public class Users {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
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
}
