package org.com.movie_booking_system.com.movie_booking_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class AddAdmin implements AdminService {


    @Autowired

    public static void addTheatre(Theatre theatre){
        System.out.println("Theatre Name:"+theatre.save());
    }
    @GetMapping("/allAdmin/")

    @GetMapping("/allAdmin/")
    @Autowired
    @PostMapping("/allAdmin/")
    public Integer AddMovie(Movie movie,@RequestParam Integer adminid){
        if(adminid>=0)System.out.println(movie.save()+"true");
        else return 0;
    }
    @GetMapping("/allAdmin/")

    public static void getScreen(Screen screen){
        if(adminId>)
    }
    @PostMapping("/allAdmin/")
    @Autowired
    public static void addScreen(Screen screen ){
       if(screen>=0){
           System.out.println("Movie Screen"+screen.save());
       }
       else return 0;
    }

    @PostMapping("/allAdmin/")
    @Autowired
    public static void addTheatre(@RequestParam theatre ){

        System.out.println("Theatre Name:"+theatre);
    }

    @PostMapping("/allAdmin/")
    public static void addShow(@RequestParam Integer showId){

        System.out.println("Show Name:"+showId.save());
    }

    @PostMapping("/allAdmin/")
    @Autowired
    public static void deleteTheatre(@RequestParam Integer showId){
        if(showId>=0){
            System.out.println("Theatre Name deleted:"+showId--);
        }
        else return 0;

    }

    @PostMapping("/allAdmin/")
    @Autowired
    public Integer deleteScreen(@RequestParam Integer screenId){
        if(screenId>=0){
            return "Deleted screen id" +screenId--;
        }
        else return 0;
    }
}
