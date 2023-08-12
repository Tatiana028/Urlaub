package com.vacations.website.domain;

import jakarta.persistence.*;

@Entity
@Table

public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airlineID;

    private String airlineName;

}
