package com.vacations.website.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Flug")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightID;

    @Column(name="Preis", nullable = false)
    private double price;

    private long destinationAirportID;

    private long departureAirportID;

    private LocalDateTime arrivalTime;

    private LocalDateTime departureTime;
}
