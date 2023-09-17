package com.vacations.website.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="Flug")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long flightID;

    @Column(name="Preis", nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airplaneID")
    private Airplane airplane;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "destinationAirportID")
    private Airport destinationAirport;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "departureAirportID")
    private Airport departureAirport;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Booking> bookings;

    private LocalDateTime arrivalTime;

    private LocalDateTime departureTime;

    public Flight(double price, Airplane airplane, Airport destinationAirport,
                  Airport departureAirport, LocalDateTime arrivalTime, LocalDateTime departureTime) {
        this.price = price;
        this.airplane = airplane;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public Flight() {

    }

    public long getFlightID() {
        return flightID;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Airport getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(Airport destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
}
