package com.vacations.website.domain;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FlightRepositoryCustomImpl implements FlightRepositoryCustom{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Flight> findAllByDepartureAirportAndDestinationAirport(Airport departureAirport, Airport destinationAirport) {

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Flight> query = cb.createQuery(Flight.class);
        Root<Flight> flight = query.from(Flight.class);

        Predicate where1 = cb.equal(flight.get("destinationAirport"), destinationAirport);
        Predicate where2 = cb.equal(flight.get("departureAirport"), departureAirport);
        query.select(flight)
                .where(cb.and(where1, where2));

        List <Flight> listOfFlights = entityManager.createQuery(query).getResultList();
        for (Flight f : listOfFlights) {
            int duration = (int) (Duration.between(f.getArrivalTime(), f.getDepartureTime()).getSeconds() / 60);
            f.setFlightDuration(duration);
        }
        return listOfFlights;
    }
}
