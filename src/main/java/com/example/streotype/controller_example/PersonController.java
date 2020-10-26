package com.example.streotype.controller_example;

import com.example.streotype.service_example.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService; //Constructor injection
    }

    public void showPerson(){
        System.out.println(personService.getPersonList());
    }

}
