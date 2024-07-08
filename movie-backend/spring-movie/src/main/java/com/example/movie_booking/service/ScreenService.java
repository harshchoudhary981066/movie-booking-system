package com.example.movie_booking.service;

import com.example.movie_booking.model.Show;

public interface ScreenService {
    Show searchShow(String showName);
    void showShows();
    // Other screen-related operations as needed
}

