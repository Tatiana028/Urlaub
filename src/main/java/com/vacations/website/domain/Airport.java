package com.vacations.website.domain;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table

public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airportID;

    private String airportName;

    private String airportLocation;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "destinationAirport")
    private List<Flight> destinationFlights;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "departureAirport")
    private List<Flight> departureFlights;
}
