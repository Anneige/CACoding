package use_case.clear_users;

// Complete me
public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData listUser);

    void prepareFailView(String error);
}
