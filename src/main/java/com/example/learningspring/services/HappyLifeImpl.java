package com.example.learningspring.services;

import com.example.learningspring.services.HappyLifeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("simple")
public class HappyLifeImpl implements HappyLifeService {

    @Override
    public String happyLife() {
        return  "Live a happy life!";
    }
}
