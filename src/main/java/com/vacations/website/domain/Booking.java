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

}
