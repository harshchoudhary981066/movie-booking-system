package com.example.movie_booking.model;

import lombok.*;



import java.time.LocalDate;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Admin {

    private String adminId;

    private String adminName;

    private String adminPassword;

    private LocalDate dateOfBirth;

    private String adminContact;



    public Theater addTheater(Theater theater) {

        // Logic to add theater

        return theater;

    }



    public boolean deleteTheater(Integer theaterId) {

        // Logic to delete theater

        return true; // Placeholder for successful deletion

    }



    public Movie addMovie(Movie movie) {

        // Logic to add movie

        return movie;

    }



    public boolean deleteMovie(Integer movieId) {

        // Logic to delete movie

        return true; // Placeholder for successful deletion

    }



    public Screen addScreen(Screen screen) {

        // Logic to add screen

        return screen;

    }



    public boolean deleteScreen(Integer screenId) {

        // Logic to delete screen

        return true; // Placeholder for successful deletion

    }



    public Show addShow(Show show) {

        // Logic to add show

        return show;

    }



    public boolean deleteShow(Integer showId) {

        // Logic to delete show

        return true; // Placeholder for successful deletion

    }

}

