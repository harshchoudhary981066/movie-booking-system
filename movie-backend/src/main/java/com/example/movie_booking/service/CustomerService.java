package com.example.movie_booking.service;

import com.example.movie_booking.model.Theater;
import com.example.movie_booking.model.Ticket;
import model.*;
public interface CustomerService {
    boolean chooseCity(String city);
    boolean bookMovieTicket(Theater theater);
    boolean cancelMovieTicket(Ticket ticket);
}
