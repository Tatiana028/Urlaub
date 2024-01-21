package com.vacations.website;

import com.vacations.website.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;


@Controller
public class VacationController {

    @Autowired
    AirlineRepository airlineRepository;

    @GetMapping("/add-airline")
    public String addAirline(Airline airline) {
        return "add-airline";
    }





    @PostMapping("/add-airline")
    public String addAirline(Airline airline, Model model) {
        airlineRepository.save(airline);
        return "add-airline";
    }


    @Autowired
    AirplaneRepository airplaneRepository;

    @GetMapping("/add-airplane")
    public String addAirplane(Airplane airplane) {
        return "add-airplane";
    }

    @PostMapping("/add-airplane")
    public String addAirplane(Airplane airplane, Model model) {
        airplaneRepository.save(airplane);
        return "add-airplane";
    }


    @Autowired
    AirportRepository airportRepository;

    @GetMapping("/add-airport")
    public String addAirport(Airport airport) {
        return "add-airport";
    }

    @PostMapping("/add-airport")
    public String addAirport(Airport airport, Model model) {
        airportRepository.save(airport);
        return "add-airport";
    }


    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/add-booking")
    public String addBooking(Booking booking) {
        return "add-booking";
    }

    @PostMapping("/add-booking")
    public String addBooking(Booking booking, Model model) {
        bookingRepository.save(booking);
        return "add-booking";
    }

    @Autowired
    FlightRepository flightRepository;

    @GetMapping("/add-flight")
    public String addFlight(Model model) {
        model.addAttribute("flight", new Flight());
        model.addAttribute("airplanes", airplaneRepository.findAll());
        return "add-flight";
    }

    @PostMapping("/add-flight")
    public String addFlight(Flight flight, Model model) {
        flightRepository.save(flight);
        return "add-flight";
    }


    @Autowired
    UserRepository userRepository;

    @GetMapping("/add-user")
    public String addUser(User user) {
        return "add-user";
    }

    @PostMapping("/add-user")
    public String addUser(User user, Model model) {
        userRepository.save(user);
        return "add-user";
    }

}
