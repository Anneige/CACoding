package use_case.clear_users;

// Complete me

public class ClearOutputData {

    private final String username;
    private boolean useCaseFailed;

    public ClearOutputData(String username, boolean useCaseFailed) {
        this.username = username;
        this.useCaseFailed = useCaseFailed;
    }

    public String getUsername() {
        return username;
    }

}
