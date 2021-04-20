package com.example.learningspring.controllers;

import com.example.learningspring.services.HappyLifeForeverImpl;
import com.example.learningspring.services.HappyLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private HappyLifeService happyLifeService;
    private HappyLifeService happyLifeServiceForever;
    private HappyLifeService happyLifeServiceMiddle;

    @Autowired
    public GreetingController(HappyLifeService happyLifeService) {
        this.happyLifeService = happyLifeService;
    }

    @Autowired
    @Qualifier("happyLifeServiceForever")
    public void setHappyLifeServiceForever(HappyLifeService happyLifeServiceForever) {
        this.happyLifeServiceForever = happyLifeServiceForever;
    }

    @Autowired
    @Qualifier("middle")
    public void setHappyLifeServiceMiddle(HappyLifeService happyLifeServiceMiddle){
        this.happyLifeServiceMiddle=happyLifeServiceMiddle;
    }

    public String sayGreeting() {
        String greeting = happyLifeService.happyLife();
        System.out.println(greeting);
        System.out.println(happyLifeServiceForever.happyLife());
        System.out.println(happyLifeServiceMiddle.happyLife());
        return greeting;
    }
}
