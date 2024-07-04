package com.example.movie_booking.controller;

import com.example.movie_booking.model.Theater;
import com.example.movie_booking.model.Ticket;
import com.example.movie_booking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/chooseCity")
    public boolean chooseCity(@RequestParam String city) {
        return customerService.chooseCity(city);
    }

    @PostMapping("/bookMovieTicket")
    public boolean bookMovieTicket(@RequestBody Theater theater) {
        return customerService.bookMovieTicket(theater);
    }

    @DeleteMapping("/cancelMovieTicket/{ticketId}")
    public boolean cancelMovieTicket(@PathVariable Integer ticketId) {
        Ticket ticket = new Ticket(); // Assume ticket retrieval logic
        return customerService.cancelMovieTicket(ticket);
    }
}
