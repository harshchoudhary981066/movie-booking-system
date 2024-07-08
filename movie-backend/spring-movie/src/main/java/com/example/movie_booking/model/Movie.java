package com.example.movie_booking.model;

import lombok.*;



import java.time.LocalDate;

import java.util.List;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Movie {

    private Integer movieId;

    private String movieName;

    private List<String> movieGenre;

    private LocalDate movieDirector;

    private Integer movieLength;

    private List<String> languages;

    private LocalDate movieReleaseDate;

}