package com.example.finalassignment.service.impl;

import com.example.finalassignment.model.TvSerie;
import com.example.finalassignment.repository.MovieRepository;
import com.example.finalassignment.repository.TvSerieRepository;
import com.example.finalassignment.service.TvSerieService;
import jakarta.inject.Inject;

import java.util.List;

public class TvSerieServiceImpl implements TvSerieService {

    @Inject
    private TvSerieRepository tvSerieRepository;
    @Override
    public TvSerie create(TvSerie tvSerie) {
        return tvSerieRepository.create(tvSerie);
    }

    @Override
    public TvSerie findById(long id) {
        return tvSerieRepository.read(id);
    }

    @Override
    public List<TvSerie> findAll() {
        return tvSerieRepository.read();
    }

    @Override
    public TvSerie update(TvSerie tvSerie) {
        return tvSerieRepository.update(tvSerie);
    }

    @Override
    public boolean delete(long id) {
        return tvSerieRepository.delete(id);
    }
}
