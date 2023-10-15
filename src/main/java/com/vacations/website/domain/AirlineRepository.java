package com.vacations.website.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirlineRepository extends CrudRepository<Airline, Long> {


    List<Airline> findByAirlineNameStartsWith(String letter);

}
