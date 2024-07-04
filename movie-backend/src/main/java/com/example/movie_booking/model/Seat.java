package com.example.movie_booking.model;

import lombok.*;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Seat {

    private Integer seatId;

    private BookingState seatStatus;

    private Double seatPrice;



    // Method to block a seat

    public void blockSeat() {

        // Implement block seat logic

    }



    // Method to book a seat

    public void bookSeat() {

        // Implement book seat logic

    }



    // Method to cancel a seat

    public void cancelSeat() {

        // Implement cancel seat logic

    }

}


