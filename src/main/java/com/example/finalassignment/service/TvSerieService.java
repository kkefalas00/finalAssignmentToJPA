package com.example.finalassignment.service;

import com.example.finalassignment.model.TvSerie;

import java.util.List;

public interface TvSerieService {

    TvSerie create(TvSerie tvSerie);
    TvSerie findById(long id);
    List<TvSerie> findAll();
    TvSerie update(TvSerie tvSerie);
    boolean delete(long id);

}
