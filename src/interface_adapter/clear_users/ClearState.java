package interface_adapter.clear_users;

// Complete me

import java.util.Collections;
import java.util.List;

public class ClearState {

    private List<String> listClearedUsers;
    private String listClearUsersError = null;

    public ClearState(interface_adapter.clear_users.ClearState copy) {
        listClearedUsers = copy.listClearedUsers;
        listClearUsersError = copy.listClearUsersError;
    }

    // Because of the previous copy constructor, the default constructor must be explicit.
    public ClearState() {}

//    public void clearUsers() {
//        this.listClearedUsers = listClearedUsers;
//    }

    public List<String> getListClearedUsers() {
        return listClearedUsers;
    }

    public String getClearUsersError() {
        return listClearUsersError;
    }
    public void setListClearedUsers(List<String> listClearedUsers) {this.listClearedUsers = listClearedUsers; }

    public void setListClearUsersError(String listClearUsersError) {
        this.listClearUsersError = listClearUsersError;
    }

    public String toString() {
//        StringBuilder users = new StringBuilder();
//        for (String i : listClearedUsers) {
//            users.append(i);
//            users.append('\n');
//
//        }
//        return users.toString();
        return listClearedUsers.toString();

    }


}
