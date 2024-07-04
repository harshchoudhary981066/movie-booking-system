package com.example.movie_booking.model;

import lombok.*;


import java.time.LocalDate;
import java.util.List;



@Getter

@Setter

@NoArgsConstructor

@AllArgsConstructor

@ToString

public class Screen {

    private Integer screenId;

    private Integer theatreId;

    private String screenName;

    private List<Show> showList;

    private LocalDate movieEndDate;

    private Integer rows;

    private Integer columns;



    // Method to search for a show in the screen

    public Show searchShow(String showName) {

        for (Show show : showList) {

            if (show.getShowName().equals(showName)) {

                return show;

            }

        }

        return null; // Show not found

    }



    // Method to show all shows in the screen

    public void showShows() {

        for (Show show : showList) {

            System.out.println(show);

        }

    }

}