package com.example.movie_booking.repository;

import com.example.movie_booking.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {

    List<Show> findByTheaterId(Integer theaterId);

    List<Show> findByMovieId(Integer movieId);

}
