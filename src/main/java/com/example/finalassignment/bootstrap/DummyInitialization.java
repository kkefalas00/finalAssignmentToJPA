package com.example.finalassignment.bootstrap;


import com.example.finalassignment.model.Cast;
import com.example.finalassignment.model.Movie;
import com.example.finalassignment.repository.impl.CastRepositoryImpl;
import com.example.finalassignment.repository.impl.MovieRepositoryImpl;
import com.example.finalassignment.service.impl.CastServiceImpl;
import com.example.finalassignment.service.impl.MovieServiceImpl;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class DummyInitialization {


    @Inject
    CastRepositoryImpl castRepositoryImpl;
    @Inject
    MovieRepositoryImpl movieRepositoryimpl;
    @Inject
    CastServiceImpl castServiceimpl;
    @Inject
    MovieServiceImpl movieServiceImpl;

    @PostConstruct
    public void test() {

        //Create 20 movies

        Movie movie1 = Movie.builder().movie_name("Matrix").movie_tickets(25000).build();
        Movie movie2 = Movie.builder().movie_name("Superman").movie_tickets(40000).build();
        Movie movie3 = Movie.builder().movie_name("Matrix2").movie_tickets(50000).build();
        Movie movie4 = Movie.builder().movie_name("Matrix 3").movie_tickets(35000).build();
        Movie movie5 = Movie.builder().movie_name("Final fantasy").movie_tickets(68000).build();
        Movie movie6 = Movie.builder().movie_name("Spiderman").movie_tickets(100000).build();
        Movie movie7 = Movie.builder().movie_name("Spiderman 2").movie_tickets(200000).build();
        Movie movie8 = Movie.builder().movie_name("Spiderman 3").movie_tickets(180000).build();
        Movie movie9 = Movie.builder().movie_name("Avengers").movie_tickets(10000000).build();
        Movie movie10 = Movie.builder().movie_name("Tomb Raider").movie_tickets(180000).build();
        Movie movie11= Movie.builder().movie_name("Power Rangers").movie_tickets(250000).build();
        Movie movie12 = Movie.builder().movie_name("Thundercats").movie_tickets(500000).build();
        Movie movie13 = Movie.builder().movie_name("Pokemon").movie_tickets(1500000).build();
        Movie movie14 = Movie.builder().movie_name("Pretty Woman").movie_tickets(150000).build();
        Movie movie15 = Movie.builder().movie_name("Tekken 3").movie_tickets(300000).build();
        Movie movie16 = Movie.builder().movie_name("Crash Bandicoot").movie_tickets(2500000).build();
        Movie movie17 = Movie.builder().movie_name("Batman Begins").movie_tickets(2500000).build();
        Movie movie18 = Movie.builder().movie_name("Avengers Civil War").movie_tickets(1000000).build();
        Movie movie19 = Movie.builder().movie_name("Avengers End Game").movie_tickets(200000000).build();
        Movie movie20 = Movie.builder().movie_name("Cortex Strikes back").movie_tickets(100000).build();

        //Using the movieServiceImpl storing them to database
        movieServiceImpl.create(movie1);
        movieServiceImpl.create(movie2);
        movieServiceImpl.create(movie3);
        movieServiceImpl.create(movie4);
        movieServiceImpl.create(movie5);
        movieServiceImpl.create(movie6);
        movieServiceImpl.create(movie6);
        movieServiceImpl.create(movie7);
        movieServiceImpl.create(movie8);
        movieServiceImpl.create(movie9);
        movieServiceImpl.create(movie10);
        movieServiceImpl.create(movie11);
        movieServiceImpl.create(movie12);
        movieServiceImpl.create(movie13);
        movieServiceImpl.create(movie14);
        movieServiceImpl.create(movie15);
        movieServiceImpl.create(movie16);
        movieServiceImpl.create(movie17);
        movieServiceImpl.create(movie18);
        movieServiceImpl.create(movie19);
        movieServiceImpl.create(movie20);


        //Creating different Casts
        Cast cast1= Cast.builder().type("Actor").movie(movie1).build();
        Cast cast2= Cast.builder().type("Director").movie(movie2).build();
        Cast cast3= Cast.builder().type("Director").movie(movie1).build();
        Cast cast4= Cast.builder().type("Actor").movie(movie2).build();
        Cast cast5= Cast.builder().type("Director").movie(movie1).build();
        Cast cast6= Cast.builder().type("Actor").movie(movie1).build();
        Cast cast7= Cast.builder().type("Director").movie(movie2).build();
        Cast cast8= Cast.builder().type("Director").movie(movie3).build();
        Cast cast9= Cast.builder().type("Actor").movie(movie4).build();
        Cast cast10= Cast.builder().type("Director").movie(movie5).build();
        Cast cast11= Cast.builder().type("Director").movie(movie1).build();
        Cast cast12= Cast.builder().type("Director").movie(movie1).build();
        Cast cast13= Cast.builder().type("Director").movie(movie2).build();
        Cast cast14= Cast.builder().type("Director").movie(movie1).build();
        Cast cast15= Cast.builder().type("Actor").movie(movie2).build();
        Cast cast16= Cast.builder().type("Director").movie(movie1).build();
        Cast cast17= Cast.builder().type("Actor").movie(movie1).build();
        Cast cast18= Cast.builder().type("Director").movie(movie2).build();
        Cast cast19= Cast.builder().type("Director").movie(movie8).build();
        Cast cast20= Cast.builder().type("Director").movie(movie1).build();

        //Using CastService to store the casts at database
        castServiceimpl.create(cast1);
        castServiceimpl.create(cast2);
        castServiceimpl.create(cast3);
        castServiceimpl.create(cast4);
        castServiceimpl.create(cast5);
        castServiceimpl.create(cast6);
        castServiceimpl.create(cast7);
        castServiceimpl.create(cast8);
        castServiceimpl.create(cast9);
        castServiceimpl.create(cast10);
        castServiceimpl.create(cast11);
        castServiceimpl.create(cast12);
        castServiceimpl.create(cast13);
        castServiceimpl.create(cast14);
        castServiceimpl.create(cast15);
        castServiceimpl.create(cast16);
        castServiceimpl.create(cast17);
        castServiceimpl.create(cast18);
        castServiceimpl.create(cast19);
        castServiceimpl.create(cast20);


//        //Printing the 10 first movies regarding the tickets
//        System.out.println(movieServiceImpl.getTheTop10MoviesByTickets());

        //Printing the movies with ID 1 and the cast are actors
        System.out.println(castServiceimpl.getMoviesByActors(1L));

        //Printing the movies with ID 1 and the cast are directors
        System.out.println(castServiceimpl.getMoviesByDirectors(1L));
    }
}
