package data_access;

import entity.User;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.signup.SignupUserDataAccessInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryUserDataAccessObject implements SignupUserDataAccessInterface, ClearUserDataAccessInterface {

    private final Map<String, User> users = new HashMap<>();

    /**
     * @param identifier the user's username
     * @return whether the user exists
     */
    @Override
    public boolean existsByName(String identifier) {
        return users.containsKey(identifier);
    }

    /**
     * @param user the data to save
     */
    @Override
    public void save(User user) {
        users.put(user.getName(), user);
    }

    public void clear() {users.clear();}

    @Override
    public List<String> getAccounts() {

        List<String> listUser = new ArrayList<String>(users.keySet());
        return listUser;}

    @Override
    public boolean isEmpty() {return users.isEmpty();}
}
