package com.vacations.website.domain;

import jakarta.persistence.*;

@Entity
@Table

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookingID;

    private long flightID;

    private long userID;

    private int bookingDate;

    private int place;
    public Booking(long flightID, long userID, int bookingDate, int place) {
        this.flightID = flightID;
        this.userID = userID;
        this.bookingDate = bookingDate;
        this.place = place;
    }

    public long getBookingID() {
        return bookingID;
    }

    public void setBookingID(long bookingID) {
        this.bookingID = bookingID;
    }

    public long getFlightID() {
        return flightID;
    }

    public void setFlightID(long flightID) {
        this.flightID = flightID;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
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

}
