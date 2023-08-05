package com.vacations.website;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping(method = RequestMethod.GET, path = "/vacation")
    public String greeting() {
        return "Hallo!";
    }
}
