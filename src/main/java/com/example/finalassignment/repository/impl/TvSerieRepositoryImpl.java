package com.example.finalassignment.repository.impl;

import com.example.finalassignment.model.TvSerie;
import com.example.finalassignment.repository.TvSerieRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class TvSerieRepositoryImpl extends RepositoryImpl<TvSerie, Long> implements TvSerieRepository{
    @PersistenceContext(unitName = "Persistence")
    private EntityManager em;

    @Override
    public Class<TvSerie> getClassType() {
        return TvSerie.class;
    }

    @Override
    public String getClassName() {
        return TvSerie.class.getSimpleName();
    }

}
