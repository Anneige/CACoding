package interface_adapter.clear_users;

// Complete me

import interface_adapter.ViewManagerModel;
import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import interface_adapter.clear_users.ClearState;

public class ClearPresenter implements ClearOutputBoundary {

    private final ClearViewModel clearViewModel;
    private final SignupViewModel signupViewModel;
    public ClearState clearState;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                          ClearViewModel clearViewModel,
                          SignupViewModel signupViewModel) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
        this.signupViewModel = signupViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        // On success, switch to the sign up view.

        clearState.setListClearedUsers(response.getListUsers());
        SignupState signupState = signupViewModel.getState();
//        signupState.getUsername();
        this.signupViewModel.setState(signupState);
        signupViewModel.firePropertyChanged();
//        JOptionPane.showConfirmDialog(SignupView.this, state.toString());

        viewManagerModel.setActiveView(signupViewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.getClearUsersError();
        clearViewModel.firePropertyChanged();
    }
}
