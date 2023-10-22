package interface_adapter.clear_users;

// Complete me

import java.util.Collections;
import java.util.List;

public class ClearState {

    private List<String> listClearedUsers;
    private List<String> listClearUsersError = null;

    public ClearState(interface_adapter.clear_users.ClearState copy) {
        listClearedUsers = copy.listClearedUsers;
        listClearUsersError = copy.listClearUsersError;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {}

    public void clearUsers() {
        this.listClearedUsers = listClearedUsers;
    }

    public List<String> getListClearedUsers() {
        return listClearedUsers;
    }

    public List<String> getClearUsersError() {
        return listClearUsersError;
    }
    public String toString() {
        String users = "";
        for (String i : listClearedUsers) {
            users += i + '\'';

        }
        return users;
    }


}
