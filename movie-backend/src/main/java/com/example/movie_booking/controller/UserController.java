package com.example.movie_booking.controller;

import com.example.movie_booking.model.User;
import com.example.movie_booking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @PostMapping("/signin")
    public boolean signIn(@RequestParam String userName, @RequestParam String password) {
        return userService.signIn(userName, password);
    }

    @PostMapping("/signout")
    public boolean signOut() {
        return userService.signOut();
    }
}
