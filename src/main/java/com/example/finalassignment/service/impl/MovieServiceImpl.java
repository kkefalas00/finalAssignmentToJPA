package com.example.finalassignment.service.impl;

import com.example.finalassignment.model.Movie;
import com.example.finalassignment.repository.MovieRepository;
import com.example.finalassignment.service.MovieService;
import jakarta.inject.Inject;

import java.util.List;

public class MovieServiceImpl implements MovieService{

    @Inject
    private MovieRepository movieRepository;

    @Override
    public Movie create(Movie movie) {
        return movieRepository.create(movie);
    }

    @Override
    public Movie findById(long id) {
        return movieRepository.read(id);
    }

    @Override
    public Movie findByMovieName(String name) {
        return movieRepository.getMovieByMovieName(name);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.read();
    }

    @Override
    public Movie update(Movie movie) {
        return movieRepository.update(movie);
    }

    @Override
    public boolean delete(long columnId) {
        return movieRepository.delete(columnId);
    }

    @Override
    public List<Movie> getTheTop10MoviesByTickets() {
        return movieRepository.getTop10Movies();
    }


}
