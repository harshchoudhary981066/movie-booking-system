package com.example.movie_booking.service;

import com.example.movie_booking.model.User;

public interface UserService {
    User registerNewUser(User user);
    boolean signIn(String userName, String password);
    boolean signOut();
}
