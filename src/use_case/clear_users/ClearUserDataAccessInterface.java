package use_case.clear_users;

// Complete me

import entity.User;

import java.util.List;
import java.util.Map;

public interface ClearUserDataAccessInterface {
    boolean isEmpty();
    void clear();
    List<String> getAccounts ();


//    boolean existsByName(String identifier);
//
//    void save(User user);
//
//    User get(String username);
}
