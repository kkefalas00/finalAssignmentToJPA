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
@Table(name="Cast")
public class Cast {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long castId;

    @ManyToOne()
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne()
    @JoinColumn(name = "tvserie_id")
    private TvSerie tvSerie;


    @Column(name="type")
    private String type;



}