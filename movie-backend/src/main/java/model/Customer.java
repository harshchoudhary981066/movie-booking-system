package model;

import lombok.*;



import java.time.LocalDate;

import java.util.List;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Customer {

    private String customerId;

    private String customerName;

    private String customerPassword;

    private LocalDate dateOfBirth;

    private List<Ticket> myTickets;

    private String customerContact;



    public boolean chooseCity(String city) {

        // Logic to select city and return theaters

        return true; // Placeholder for city selection

    }



    public boolean bookMovieTicket(Theater theater) {

        // Logic to book movie ticket

        return true; // Placeholder for successful booking

    }



    public boolean cancelMovieTicket(Ticket ticket) {

        // Logic to cancel movie ticket

        return true; // Placeholder for successful cancellation

    }

}

