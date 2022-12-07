package com.example.finalassignment.service.impl;
import com.example.finalassignment.model.Cast;
import com.example.finalassignment.repository.impl.CastRepositoryImpl;
import com.example.finalassignment.repository.impl.MovieRepositoryImpl;
import com.example.finalassignment.service.CastService;
import jakarta.inject.Inject;

import java.util.List;

public class CastServiceImpl implements CastService{

    @Inject
    private CastRepositoryImpl castRepositoryImpl;

    @Inject
    private MovieRepositoryImpl movieRepositoryImpl;


    @Override
    public Cast create(Cast cast) {
        return castRepositoryImpl.create(cast);
    }

    @Override
    public List<Cast> findAll() {
        return castRepositoryImpl.read();
    }

    @Override
    public Cast findByTicketId(Long column1Id) {
        return castRepositoryImpl.read(column1Id);
    }

    @Override
    public Cast update(Cast cast) {
        return castRepositoryImpl.update(cast);
    }

    @Override
    public boolean delete(Long column1Id) {
        return castRepositoryImpl.delete(column1Id);
    }

    @Override
    public List<Cast> getMoviesByActors(Long id) {
        return castRepositoryImpl.getMoviesByActors(id);
    }

    @Override
    public List<Cast> getMoviesByDirectors(Long id) {
        return castRepositoryImpl.getMoviesByDirectors(id);
    }


}
