package com.example.finalassignment.repository.impl;

import com.example.finalassignment.model.Movie;
import com.example.finalassignment.repository.MovieRepository;
import jakarta.persistence.*;

import java.util.List;

public class MovieRepositoryImpl extends RepositoryImpl<Movie, Long> implements MovieRepository {

    @PersistenceContext(unitName = "Persistence")
    private EntityManager em;

    @Override
    public Class<Movie> getClassType() {
        return Movie.class;
    }

    @Override
    public String getClassName() {
        return Movie.class.getSimpleName();
    }

    @Override

    public Movie getMovieByMovieName(String name) throws NoResultException, NonUniqueResultException {
        return (Movie)  em.createQuery("Select u from "+getClassName()+" u where u.movie_name="+name).getSingleResult();
    }

    @Override
    public List<Movie> getTop10Movies() {
        Query query = super.getEm().createQuery("select m from "+ getClassName()+ " m  ORDER BY m.movie_tickets DESC " );

        List<Movie> movies= query.setMaxResults(10).getResultList();

        return movies;
    }


}
