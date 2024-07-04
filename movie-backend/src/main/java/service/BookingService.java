package service;

import model.Booking;
import model.Seat;

public interface BookingService {
    Seat[] chooseSeats();
    double calculateTotalCost();
    void choosePaymentMethod();
    boolean makePayment();
    void showTicket();
    boolean cancelBookings(Seat[] seats);
}

