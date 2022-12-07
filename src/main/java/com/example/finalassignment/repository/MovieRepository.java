package com.example.finalassignment.repository;

import com.example.finalassignment.model.Movie;

import java.util.List;

public interface MovieRepository extends Repository<Movie, Long>{

    Movie getMovieByMovieName(String name);

    List<Movie> getTop10Movies();


}
