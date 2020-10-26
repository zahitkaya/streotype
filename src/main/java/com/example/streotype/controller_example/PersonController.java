package com.example.streotype.controller_example;

import com.example.streotype.service_example.PersonService;
import org.springframework.stereotype.Controller;

@Controller
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    public void showPerson(){
        System.out.println(personService.getPersonList());
    }
}
