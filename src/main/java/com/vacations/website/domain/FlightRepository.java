package com.vacations.website.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

    List<Flight> findAllByDepartureAirportAndDestinationAirport (Airport departureAirport, Airport destinationAirport);

    // SELECT * FROM Flug WHERE departureAirport = "" AND destinationAirport = "" AND departureTime = ""

}

