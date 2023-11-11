package use_case.clear_users;

// Complete me

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
//        String username = clearInputData.getUsername();
//        String password = clearInputData.getPassword();
//        if (!userDataAccessObject.existsByName(username)) {
//            clearPresenter.prepareFailView(username + ": Account does not exist.");
//        } else {
//            String pwd = userDataAccessObject.get(username).getPassword();
//            if (!password.equals(pwd)) {
//                clearPresenter.prepareFailView("Incorrect password for " + username + ".");
//            } else {
//
//                User user = userDataAccessObject.get(clearInputData.getUsername());
//
//                ClearOutputData clearOutputData = new ClearOutputData(user.getName(), false);
//                clearPresenter.prepareSuccessView(clearOutputData);
//            }
//        }

//        if (userDataAccessObject.isEmpty()) {
//            clearPresenter.prepareFailView("Users cleared");
//        } else {
//            Map<String, User> currentMapUsers = userDataAccessObject.getAccounts();
//            List<String> listUser = new ArrayList<String>(currentMapUsers.keySet());
//            userDataAccessObject.clear();
//
//            ClearOutputData clearOutputData = new ClearOutputData(listUser, false);
//            clearPresenter.prepareSuccessView(clearOutputData);
//        }
        if (userDataAccessObject.isEmpty()) {
            clearPresenter.prepareFailView("No users to be cleared");}

        else{
            Map<String, User> currentMapUsers = userDataAccessObject.getAccounts();
            List<String> listUser = new ArrayList<String>(currentMapUsers.keySet());
            userDataAccessObject.clear();

            ClearOutputData clearOutputData = new ClearOutputData(listUser, false);
            clearPresenter.prepareSuccessView(clearOutputData);
        }


    }
}