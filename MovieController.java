package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService; 

    @GetMapping("/movie")
    public String getMovie() {
        return movieService.getMovie();
    }
}