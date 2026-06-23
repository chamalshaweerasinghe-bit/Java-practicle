class UserAccount {

    // Private variables (Encapsulation)
    private String username;
    private String email;
    private String accountStatus;
    private int failedLoginAttempts;
    private String password;

    // Constructor
    UserAccount(String username, String email,
                String accountStatus,
                int failedLoginAttempts,
                String password) {

        this.username = username;
        this.email = email;
        this.accountStatus = accountStatus;
        this.failedLoginAttempts = failedLoginAttempts;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for failed attempts
    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    // Setter for failed attempts
    public void setFailedLoginAttempts(int attempts) {

        if (attempts < 0) {
            System.out.println("Error: Negative values are not allowed.");
        } else {
            failedLoginAttempts = attempts;
        }
    }

    // Login method
    public void login(String enteredPassword) {

        if (enteredPassword.equals(password)) {
            System.out.println("Login Successful!");
            failedLoginAttempts = 0;
        } else {
            System.out.println("Login Failed!");
            failedLoginAttempts++;
        }
    }

    // Lock check
    public void lockCheck() {

        if (failedLoginAttempts >= 3) {
            accountStatus = "Locked";
            System.out.println("WARNING: Account Locked!");
        } else {
            System.out.println("Account is Active.");
        }
    }
}

public class Main2 {

    public static void main(String[] args) {

        // TEST FIRST
        System.out.println("=== TESTING UserAccount ===");

        UserAccount u1 = new UserAccount(
                "admin01",
                "admin@gmail.com",
                "Active",
                0,
                "1234"
        );

        // a
        System.out.println("Username: " + u1.getUsername());

        // b
        u1.setFailedLoginAttempts(-5);

        // c
        u1.login("1234");
        u1.lockCheck();

        // d
        u1.login("1111");
        u1.login("2222");
        u1.login("3333");

        u1.lockCheck();
    }
}