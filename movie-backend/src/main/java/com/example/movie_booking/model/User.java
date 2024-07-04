package com.example.movie_booking.model;

import lombok.*;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class User {

    private Integer userId;

    private String userName;

    private String password;



    public User registerNewUser() {

        // Logic to prompt user and gather necessary details

        return new User();

    }



    public boolean signIn(String userName, String password) {

        // Logic to authenticate user

        return true; // Placeholder for successful sign-in

    }



    public boolean signOut() {

        // Logic to sign out user

        return true; // Placeholder for successful sign-out

    }

}


