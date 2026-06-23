// UserAccount.java

class UserAccount {

    // Instance variables (Encapsulation using private access modifier)
    private String username;
    private String emailAddress;
    private String accountStatus;
    private int failedLoginAttempts;
    private String password;

    // Constructor
    public UserAccount(String username, String emailAddress, String password) {
        this.username = username;
        this.emailAddress = emailAddress;
        this.password = password;
        this.accountStatus = "Active";
        this.failedLoginAttempts = 0;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for failed login attempts
    public int getFailedLoginAttempts() {
        return failedLoginAttempts;
    }

    // Setter for failed login attempts
    public void setFailedLoginAttempts(int failedLoginAttempts) {

        if (failedLoginAttempts < 0) {
            System.out.println("Error: Failed login attempts cannot be negative.");
        } else {
            this.failedLoginAttempts = failedLoginAttempts;
        }
    }

    // Login method
    public void login(String enteredPassword) {

        if (enteredPassword.equals(password)) {

            System.out.println("Login successful!");
            failedLoginAttempts = 0;

        } else {

            failedLoginAttempts++;
            System.out.println("Login failed! Incorrect password.");
        }
    }

    // Lock check method
    public void lockCheck() {

        if (failedLoginAttempts >= 3) {

            accountStatus = "Locked";
            System.out.println("Warning: Account has been locked.");

        } else {

            System.out.println("Account is active.");
        }
    }
}