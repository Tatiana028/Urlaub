package com.vacations.website.domain;

import jakarta.persistence.*;

@Entity
@Table (name = "booking")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookingID;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "flightID")
    private Flight flight;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "userID")
    private User user;

    private int bookingDate;

    private int place;

    public Booking(Flight flight, User user, int bookingDate, int place) {
        this.flight = flight;
        this.user = user;
        this.bookingDate = bookingDate;
        this.place = place;
    }

    public Booking() {

    }

    public long getBookingID() {
        return bookingID;
    }

    public void setBookingID(long bookingID) {
        this.bookingID = bookingID;
    }

    public int getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(int bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
