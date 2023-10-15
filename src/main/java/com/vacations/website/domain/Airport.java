package com.vacations.website.domain;


import jakarta.persistence.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Entity
@Table


public class Airport {
    @Repository
    public interface AirportRepository extends CrudRepository<Airport, Long> {}
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long airportID;
/*@NotBlank(message:)*/
    private String airportName;

    private String airportLocation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destinationAirport")
    private List<Flight> destinationsFlights;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departureAirport")
    private List<Flight> departuresFlights;

    public Airport(String airportName, String airportLocation, List<Flight> destinationsFlights, List<Flight> departuresFlights) {
        this.airportName = airportName;
        this.airportLocation = airportLocation;
        this.destinationsFlights = destinationsFlights;
        this.departuresFlights = departuresFlights;
    }

    public Airport() {

    }

    public long getAirportID() {
        return airportID;
    }

    public void setAirportID(long airportID) {
        this.airportID = airportID;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportLocation() {
        return airportLocation;
    }

    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }

    public List<Flight> getDestinationsFlights() {
        return destinationsFlights;
    }

    public void setDestinationsFlights(List<Flight> destinationsFlights) {
        this.destinationsFlights = destinationsFlights;
    }

    public List<Flight> getDeparturesFlights() {
        return departuresFlights;
    }

    public void setDeparturesFlights(List<Flight> departuresFlights) {
        this.departuresFlights = departuresFlights;
    }
}
