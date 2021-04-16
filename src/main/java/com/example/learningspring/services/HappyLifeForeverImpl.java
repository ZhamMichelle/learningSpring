package com.example.learningspring.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("forever")
public class HappyLifeForeverImpl implements HappyLifeService{
    @Override
    public String happyLife() {
        return "happy life forever!!!!!!!!";
    }
}
