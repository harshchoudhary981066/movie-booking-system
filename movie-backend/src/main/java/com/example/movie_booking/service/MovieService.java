package com.example.movie_booking.service;

import com.example.movie_booking.model.Movie;

public interface MovieService {
    Movie getMovieById(Integer movieId);
    // Other movie-related operations as needed
}
