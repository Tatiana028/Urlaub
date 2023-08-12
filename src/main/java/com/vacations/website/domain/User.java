package com.vacations.website.domain;


import jakarta.persistence.*;

@Entity
@Table

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;

    private String userName;

    private String userSurname;

}
