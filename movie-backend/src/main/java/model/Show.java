package model;

import lombok.*;



import java.time.LocalTime;

import java.util.List;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Show {

    private Integer showId;

    private LocalTime showStartTime;

    private LocalTime showEndTime;

    private List<Seat> seats;

    private String showName;

    private Movie movieName;

    private Integer screenId;

    private Integer theaterId;



    // Method to update seats booked status

    public List<Seat> updateSeatsBooked(String[] seatNames, boolean booked) {

        // Implement update seats booked logic

        return null; // Placeholder

    }

}
