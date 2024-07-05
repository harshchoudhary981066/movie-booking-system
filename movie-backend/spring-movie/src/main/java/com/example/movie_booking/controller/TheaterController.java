package com.example.movie_booking.controller;

import com.example.movie_booking.model.Movie;
import com.example.movie_booking.model.Screen;
import com.example.movie_booking.service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/theater")
public class TheaterController {

    private final TheaterService theaterService;

    @Autowired
    public TheaterController(TheaterService theaterService) {
        this.theaterService = theaterService;
    }

    @GetMapping("/searchMovie")
    public Movie searchMovie(@RequestParam String movieName) {
        return theaterService.searchMovie(movieName);
    }

    @GetMapping("/searchScreen/{screenId}")
    public Screen searchScreen(@PathVariable Integer screenId) {
        return theaterService.searchScreen(screenId);
    }
}
