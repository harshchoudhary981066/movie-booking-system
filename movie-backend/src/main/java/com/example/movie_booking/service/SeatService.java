package com.example.movie_booking.service;

import com.example.movie_booking.model.Seat;

public interface SeatService {
    void blockSeat(Seat seat);
    void bookSeat(Seat seat);
    void cancelSeat(Seat seat);
}

