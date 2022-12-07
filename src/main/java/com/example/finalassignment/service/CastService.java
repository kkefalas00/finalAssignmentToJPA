package com.example.finalassignment.service;

import com.example.finalassignment.model.Cast;
import jakarta.transaction.Transactional;

import java.util.List;

@Transactional
public interface CastService {
    Cast create(Cast cast);
    List<Cast> findAll();
    Cast findByTicketId(Long id);
    Cast update(Cast cast);
    boolean delete(Long id);
    List<Cast> getMoviesByActors(Long id);
    List<Cast> getMoviesByDirectors(Long id);


}
