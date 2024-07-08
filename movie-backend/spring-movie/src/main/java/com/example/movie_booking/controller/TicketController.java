package com.example.movie_booking.controller;

import com.example.movie_booking.service.TicketService;
import com.example.movie_booking.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/generateTicket")
    public Ticket generateTicket() {
        return ticketService.generateTicket();
    }

    // Other ticket-related endpoints as needed
}
