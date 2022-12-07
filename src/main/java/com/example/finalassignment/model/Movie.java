package com.example.finalassignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {

    @Id
    @Column(name="movie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;

    @Column(name="movie_name")
    private String movie_name;

    @Column(name="movie_tickets")
    private double movie_tickets;


}
