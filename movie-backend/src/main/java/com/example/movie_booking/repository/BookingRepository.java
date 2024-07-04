package com.example.movie_booking.repository;

import com.example.movie_booking.model.Booking;
import com.example.movie_booking.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByCustomerId(String customerId);
    List<Booking> findByShowId(Integer showId);
}

