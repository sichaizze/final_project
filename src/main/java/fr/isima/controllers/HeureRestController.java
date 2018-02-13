package fr.isima.controllers;

import fr.isima.service.Hour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Provider;


@RestController
@RequestMapping("/rest/heure")
public class HeureRestController {

    private final Provider<Hour> generator;

    @Autowired
    public HeureRestController(Provider<Hour> generator) {
        this.generator = generator;
    }

    @GetMapping
    public Hour heure() {
        //we must do a copy or redfine default serializer
        return this.generator.get().copy();
    }

}

