package com.vacations.website;

import com.vacations.website.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserInterfaceController {
    @Autowired
    private FlightRepository flightRepository;
    @Autowired //erzeugt eine Instanz
    private AirportRepository airportRepository;

    @GetMapping("/")
    public String showStarterPage(Model model) {

        List<Airport> airports = (List<Airport>) airportRepository.findAll();
        model.addAttribute("airports", airports);
        model.addAttribute("ap", new Airport());
        return "userInterface/starterPage";
    }

    @PostMapping("/show-flights")
    public String showFlights(Model model, @RequestParam String from, @RequestParam String to){
        Airport departure = airportRepository.findById(Long.parseLong(from)).get();
        Airport destination = airportRepository.findById(Long.parseLong(to)).get();
        List<Flight> selectedFlights = flightRepository.findAllByDepartureAirportAndDestinationAirport(departure,destination);
        model.addAttribute("flights", selectedFlights);
        return "userInterface/listOfFlights";
    }

    @GetMapping("/personal-data")
    public String addPersonalData(Model model){
        String from = (String) model.getAttribute("from");

        return "userInterface/personalData";
    }

    @PostMapping("/payment")
    public String payment(Model model){
        String from = (String) model.getAttribute("from");

        return "userInterface/payment";
    }

}
