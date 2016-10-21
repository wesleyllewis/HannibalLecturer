package com.theironyard.controllers;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import com.theironyard.repositories.LecturerRepository;
import com.theironyard.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HannibalLecturerController {
    @Autowired
    LecturerRepository lecturers;
    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public void createLecturer(String name, String topic, String image){
        lecturers.save(new Lecturer(name, topic, image));
    }
    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public void  createReview(String author, String text, int lecturerId, String isGood){
        reviews.save(new Review(author, text, Boolean.parseBoolean(isGood), lecturerId));
    }
    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public List<Lecturer> getLecturer(){
        return (List<Lecturer>) lecturers.findAll();
    }
    @RequestMapping(path = "/reviews{lecturerId}", method = RequestMethod.GET)
    public List<Review> reviews(int lecturerId){
        return reviews.findAllByLecturerId(lecturerId);
    }


}
