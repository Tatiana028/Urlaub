package com.vacations.website.domain;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airplaneID;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "airplane")
    private List<Flight> flights;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "airlineID")
    private Airline airline;

    private int amountOfPlaces;

    public Airplane() {

    }

    public Airplane(long flightID, Airline airline, int amountOfPlaces) {
       // this.flightID = flightID;
        this.airline = airline;
        this.amountOfPlaces = amountOfPlaces;
    }



    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }


    public int getAmountOfPlaces() {
        return amountOfPlaces;
    }

    public void setAmountOfPlaces(int amountOfPlaces) {
        this.amountOfPlaces = amountOfPlaces;
    }
}
