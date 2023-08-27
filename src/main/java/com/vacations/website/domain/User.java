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

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
