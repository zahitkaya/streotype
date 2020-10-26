package com.example.streotype;

import com.example.streotype.controller_example.PersonController;
import com.example.streotype.service_example.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class StreotypeApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("com.example.streotype");
        context.refresh();
        PersonService personService=context.getBean(PersonService.class);

        //PersonService
        System.out.println(personService.addPerson("Ali"));
        System.out.println(personService.removePerson("Veli"));
        PersonController personController=context.getBean(PersonController.class);
        personController.showPerson();



    }

}
