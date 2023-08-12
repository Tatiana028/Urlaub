package com.vacations.website.domain;


import jakarta.persistence.*;

@Entity
@Table


public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airportID;

    private String airportName;

    private String airportLocation;

}
