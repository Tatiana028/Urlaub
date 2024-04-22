package com.vacations.website.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table (name = "airplane")
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long airplaneID;

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    private String airplaneName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "airplane")
    private List<Flight> flights;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "airlineID")
    private Airline airline;

    private int amountOfPlaces;

    public Airplane( String airplaneName,Airline airline, int amountOfPlaces) {
        this.airplaneName = airplaneName;
        this.airline = airline;
        this.amountOfPlaces = amountOfPlaces;
    }

    public Airplane() {

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
