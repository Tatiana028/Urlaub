package com.vacations.website;

import com.vacations.website.domain.Airline;
import com.vacations.website.domain.Airport;
import com.vacations.website.domain.AirportRepository;
import com.vacations.website.domain.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String showFlights(@ModelAttribute Airport airport){
        String from = airport.getAirportName();
        System.out.println(from);
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
