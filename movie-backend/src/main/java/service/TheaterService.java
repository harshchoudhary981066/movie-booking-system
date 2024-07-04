package service;


import model.Movie;
import model.Screen;
import model.Theater;

public interface TheaterService {
    Movie searchMovie(String movieName);
    Screen searchScreen(Integer screenId);
}

