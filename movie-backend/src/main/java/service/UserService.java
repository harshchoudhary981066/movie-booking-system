package service;

import model.User;

public interface UserService {
    User registerNewUser(User user);
    boolean signIn(String userName, String password);
    boolean signOut();
}
