package com.example.movie_booking.repository;

import com.example.movie_booking.model.Theater;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheaterRepository extends JpaRepository<Theater, Integer> {

    List<Theater> findByTheaterCity(String city);

}
