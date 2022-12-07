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
public class Cast {

    @Id
    @Column(name="cast_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long castId;

    @Column(name="channel")
    private String channel;

    @Column(name="type")
    private String type;

    @Column(name="tickets")
    private double tickets;



}
