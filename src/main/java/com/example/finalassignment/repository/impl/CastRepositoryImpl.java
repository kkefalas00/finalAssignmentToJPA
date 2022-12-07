package com.example.finalassignment.repository.impl;

import com.example.finalassignment.model.Cast;
import com.example.finalassignment.repository.CastRepository;
import jakarta.persistence.Query;

import java.util.List;

public class CastRepositoryImpl extends RepositoryImpl<Cast, Long> implements CastRepository{
    @Override
    public Class<Cast> getClassType() {
        return Cast.class;
    }

    @Override
    public String getClassName() {
        return Cast.class.getSimpleName();
    }

    public List<Cast> getMoviesByActors(Long id) {
        Query query = super.getEm().createQuery("select c from "+ getClassName()+ " c WHERE c.movie IN (SELECT DISTINCT m.movieId FROM Movie m WHERE m.movieId IN (?1)) and c.type='Actor'" );

        query.setParameter(1, id);

        List<Cast> listOfMoviesWithActors = query.getResultList();

        return listOfMoviesWithActors;
    }

    @Override
    public List<Cast> getMoviesByDirectors(Long id) {
        Query query = super.getEm().createQuery("select c from "+ getClassName()+ " c WHERE c.movie IN (SELECT DISTINCT m.movieId FROM Movie m WHERE m.movieId IN (?1)) and c.type='Director'" );

        query.setParameter(1, id);

        List<Cast> listOfMoviesWithdirectors = query.getResultList();

        return listOfMoviesWithdirectors;
    }


}