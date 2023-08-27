package com.vacations.website.domain;

import jakarta.persistence.*;

@Entity
@Table

public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookingID;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn
    private long flightID;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "userID")
    private long userID;

    private int bookingDate;

    private int place;

}
