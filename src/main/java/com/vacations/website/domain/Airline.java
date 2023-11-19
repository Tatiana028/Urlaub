package com.vacations.website.domain;

import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Entity
@Table

public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airlineID;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "airline")
    private List<Airplane> airplaneList;

    private String airlineName;

    public Airline(String airlineName) {
       // this.airplaneList = airplaneList;
        this.airlineName = airlineName;
    }

    public Airline() {

    }

    public List<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(List<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }
}
