package com.vacations.website;

import com.vacations.website.domain.Airline;
import com.vacations.website.domain.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserInterfaceController {
    @Autowired
    private FlightRepository flightRepository;
    @GetMapping("/")
    public String showStarterPage(Airline airline) {
        return "userInterface/starterPage";
    }

    @PostMapping("/show-flights")
    public String showFlights(Model model){
        String from = (String) model.getAttribute("from");

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
