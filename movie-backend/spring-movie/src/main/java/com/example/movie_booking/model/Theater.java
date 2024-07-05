package com.example.movie_booking.model;

import lombok.*;



import java.util.List;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Theater {

    private Integer theaterId;

    private String theaterName;

    private String theaterCity;

    private List<Movie> movies;

    private List<Screen> listOfScreens;

    private String managerName;

    private String managerContact;



    // Method to search for a movie in the theater

    public Movie searchMovie(String movieName) {

        for (Movie movie : movies) {

            if (movie.getMovieName().equals(movieName)) {

                return movie;

            }

        }

        return null; // Movie not found

    }



    // Method to search for a screen in the theater

    public Screen searchScreen(Integer screenId) {

        for (Screen screen : listOfScreens) {

            if (screen.getScreenId().equals(screenId)) {

                return screen;

            }

        }

        return null; // Screen not found

    }

}
