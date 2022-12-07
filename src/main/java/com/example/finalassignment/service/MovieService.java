package com.example.finalassignment.service;

import com.example.finalassignment.model.Movie;

import java.util.List;

public interface MovieService {

    Movie create(Movie movie);
    Movie findById(long id);
    Movie findByMovieName(String name);
    List<Movie> findAll();
    Movie update(Movie movie);
    boolean delete(long id);

    List<Movie> getTheTop10MoviesByTickets();
}
