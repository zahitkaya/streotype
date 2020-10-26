package com.example.streotype.repository_example;

import com.example.streotype.service_example.PersonService;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class PersonRepository {
    private Map<Integer, String> repository;

    public PersonRepository() {
        this.repository=new HashMap<>();
    }
    public void store(PersonService personService){//method injection
        personService.getPersonList().forEach(System.out::println);
    }
}
