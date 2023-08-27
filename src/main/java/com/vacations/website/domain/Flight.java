package com.vacations.website.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="Flug")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToOne (fetch = FetchType.LAZY)
    private long flightID;

    @Column(name="Preis", nullable = false)
    private double price;


    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "destinationAirportID")
    private Airport destinationAirport;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "departureAirportID")
    private Airport departureAirport;


    private LocalDateTime arrivalTime;

    private LocalDateTime departureTime;
}
