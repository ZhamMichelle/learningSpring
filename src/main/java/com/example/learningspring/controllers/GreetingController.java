package com.example.learningspring.controllers;

import com.example.learningspring.services.HappyLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private HappyLifeService happyLifeService;

    @Autowired
    public GreetingController(HappyLifeService happyLifeService) {
        this.happyLifeService = happyLifeService;
    }

    public String sayGreeting() {
        String greeting=happyLifeService.happyLife();
        System.out.println(greeting);
        return greeting;
    }
}
