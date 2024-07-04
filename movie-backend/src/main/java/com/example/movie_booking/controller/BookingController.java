package com.example.movie_booking.controller;

import com.example.movie_booking.model.Seat;
import com.example.movie_booking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/chooseSeats")
    public Seat[] chooseSeats() {
        return bookingService.chooseSeats();
    }

    @GetMapping("/calculateTotalCost")
    public double calculateTotalCost() {
        return bookingService.calculateTotalCost();
    }

    @PostMapping("/makePayment")
    public boolean makePayment() {
        return bookingService.makePayment();
    }

    @GetMapping("/showTicket")
    public void showTicket() {
        bookingService.showTicket();
    }

    @DeleteMapping("/cancelBookings")
    public boolean cancelBookings(@RequestBody Seat[] seats) {
        return bookingService.cancelBookings(seats);
    }
}
