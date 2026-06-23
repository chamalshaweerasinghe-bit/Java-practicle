
public class User {


    private String username;
    private String password;


    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
    }

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Weak Password");
        }
    }
}