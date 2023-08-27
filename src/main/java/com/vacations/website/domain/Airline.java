package com.vacations.website.domain;

import jakarta.persistence.*;

@Entity
@Table

public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

   // @OneToMany (cascade = CascadeType.ALL, mappedBy = "airlineID")
    private int airlineID;

    private String airlineName;

    public Airline(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
