package com.vacations.website.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airplaneID;

    private long flightID;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "airlineID")
    private int airlineID;

    private int amountOfPlaces;

    public Airplane(int amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }

    public int getAmountOfPlaces() {
        return amountOfPlaces;
    }

    public void setAmountOfPlaces(int amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }
}
