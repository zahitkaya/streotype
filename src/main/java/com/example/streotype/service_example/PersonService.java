package com.example.streotype.service_example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonService {
    private ArrayList<String> personList;

    public PersonService(ArrayList personList) {
        this.personList = personList;
    }

    public ArrayList getPersonList() {
        return personList;
    }

    public String addPerson(String name) {
        personList.add(name + " eklendi");
        return name + " eklendi";
    }

    public String removePerson(String name) {
        personList.add(name + " çıkarıldı");
        return name + " çıkarıldı";
    }


}
