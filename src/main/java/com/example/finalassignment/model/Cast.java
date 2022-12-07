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
@Table(name="Movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;

    @ManyToOne()
    @JoinColumn(name = "cast_id")
    private Cast cast;


    @Column(name="title_movie")
    private String movieTitle;

    @Column(name="tickets")
    private double tickets;


}