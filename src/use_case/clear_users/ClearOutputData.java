package use_case.clear_users;

// Complete me

import java.util.List;

public class ClearOutputData {

    private final List<String> listUsers;
    private boolean useCaseFailed;

    public ClearOutputData(List<String> listUsers, boolean useCaseFailed) {
        this.listUsers = listUsers;
        this.useCaseFailed = useCaseFailed;
    }

    public List<String> getListUsers() {
        return listUsers;
    }


}
