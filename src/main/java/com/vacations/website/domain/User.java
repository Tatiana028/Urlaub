package com.vacations.website.domain;


import jakarta.persistence.*;


import java.util.List;

@Entity
@Table (name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @OneToMany (cascade = CascadeType.ALL, mappedBy = "bookingID")
    private long userID;

    private String userName;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "user")
    private List<Booking> bookings;

    private String userSurname;

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public User() {

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
