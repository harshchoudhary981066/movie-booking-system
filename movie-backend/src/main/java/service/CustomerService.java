package service;

import model.*;
public interface CustomerService {
    boolean chooseCity(String city);
    boolean bookMovieTicket(Theater theater);
    boolean cancelMovieTicket(Ticket ticket);
}
