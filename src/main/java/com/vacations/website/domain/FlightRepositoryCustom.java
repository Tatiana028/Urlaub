package com.vacations.website.domain;

import java.util.List;

public interface FlightRepositoryCustom {
    List<Flight> findAllByDepartureAirportAndDestinationAirport (Airport departureAirport, Airport destinationAirport);

}
