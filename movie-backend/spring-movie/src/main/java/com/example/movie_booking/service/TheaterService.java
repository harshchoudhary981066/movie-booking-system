package com.example.movie_booking.service;


import com.example.movie_booking.model.Movie;
import com.example.movie_booking.model.Screen;

public interface TheaterService {
    Movie searchMovie(String movieName);
    Screen searchScreen(Integer screenId);
}

