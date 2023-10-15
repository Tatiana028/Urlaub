package com.vacations.website.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

    // SELECT * FROM Flug WHERE departureAirport = "" AND destinationAirport = "" AND departureTime = ""

}

