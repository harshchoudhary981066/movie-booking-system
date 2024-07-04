package model;

import lombok.*;



import java.time.LocalDate;

import java.util.List;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Booking {

    private Integer bookingId;

    private Integer movieId;

    private Integer showId;

    private Show showRef;

    private LocalDate bookingDate;

    private Integer transactionId;

    private Double totalCost;

    private List<Seat> seatList;

    private Ticket ticket;

}