package com.example.finalassignment.repository;

import com.example.finalassignment.model.Cast;

import java.util.List;

public interface CastRepository extends Repository<Cast, Long> {

    List<Cast> getMoviesByActors(Long id);
    List<Cast> getMoviesByDirectors(Long id);
}
