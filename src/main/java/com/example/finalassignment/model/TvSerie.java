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
@Table(name="TvSerie")
public class TvSerie {

    @Id
    @Column(name="tvserie_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tvSerieId;

    @Column(name="tvseries_title")
    private String tvseries_title;

    @Column(name="tickets")
    private double tickets;

}
