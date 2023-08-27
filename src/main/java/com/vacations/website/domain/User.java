package com.vacations.website.domain;


import jakarta.persistence.*;

@Entity
@Table

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "bookingID")
    private long userID;

    private String userName;

    private String userSurname;

}
