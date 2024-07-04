package com.example.movie_booking.service;

import com.example.movie_booking.model.Seat;

public interface BookingService {
    Seat[] chooseSeats();
    double calculateTotalCost();
    void choosePaymentMethod();
    boolean makePayment();
    void showTicket();
    boolean cancelBookings(Seat[] seats);
}

