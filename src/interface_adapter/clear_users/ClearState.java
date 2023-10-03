package interface_adapter.clear_users;

// Complete me

public class ClearState {

    private String username = "";
    private String usernameError = null;
    private String password = "";
    private String passwordError = null;

    public ClearState(interface_adapter.clear_users.ClearState copy) {
        username = copy.username;
        usernameError = copy.usernameError;
        password = copy.password;
        passwordError = copy.passwordError;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {}

    public String getUsername() {
        return username;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordError() {
        return passwordError;
    }
    public void clearUsername(String username) {
        this.username = username;
    }

    public void clearUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public void clearPassword(String password) {
        this.password = password;
    }

    public void clearPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

}
