package com.example.movie_booking.service;

import com.example.movie_booking.model.Movie;
import com.example.movie_booking.model.Screen;
import com.example.movie_booking.model.Show;
import com.example.movie_booking.model.Theater;
import model.*;

public interface AdminService {
    Theater addTheater(Theater theater);
    boolean deleteTheater(Integer theaterId);
    Movie addMovie(Movie movie);
    boolean deleteMovie(Integer movieId);
    Screen addScreen(Screen screen);
    boolean deleteScreen(Integer screenId);
    Show addShow(Show show);
    boolean deleteShow(Integer showId);
}

