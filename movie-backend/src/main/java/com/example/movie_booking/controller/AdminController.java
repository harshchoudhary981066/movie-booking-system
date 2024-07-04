package com.example.movie_booking.controller;

import com.example.movie_booking.model.Movie;
import com.example.movie_booking.model.Screen;
import com.example.movie_booking.model.Show;
import com.example.movie_booking.model.Theater;
import com.example.movie_booking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/addTheater")
    public Theater addTheater(@RequestBody Theater theater) {
        return adminService.addTheater(theater);
    }

    @DeleteMapping("/deleteTheater/{theaterId}")
    public boolean deleteTheater(@PathVariable Integer theaterId) {
        return adminService.deleteTheater(theaterId);
    }

    @PostMapping("/addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return adminService.addMovie(movie);
    }

    @DeleteMapping("/deleteMovie/{movieId}")
    public boolean deleteMovie(@PathVariable Integer movieId) {
        return adminService.deleteMovie(movieId);
    }

    @PostMapping("/addScreen")
    public Screen addScreen(@RequestBody Screen screen) {
        return adminService.addScreen(screen);
    }

    @DeleteMapping("/deleteScreen/{screenId}")
    public boolean deleteScreen(@PathVariable Integer screenId) {
        return adminService.deleteScreen(screenId);
    }

    @PostMapping("/addShow")
    public Show addShow(@RequestBody Show show) {
        return adminService.addShow(show);
    }

    @DeleteMapping("/deleteShow/{showId}")
    public boolean deleteShow(@PathVariable Integer showId) {
        return adminService.deleteShow(showId);
    }
}

