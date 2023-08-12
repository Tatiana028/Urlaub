package com.vacations.website.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table

public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightID;

    private long airlineID;

    private int amountOfPlaces;

}
