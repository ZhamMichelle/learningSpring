package com.example.learningspring.config;

import com.example.learningspring.services.HappyLifeForeverImpl;
import com.example.learningspring.services.HappyLifeSimpleImpl;
import com.example.learningspring.services.HappyLifeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HappyLifyConfig {

    @Bean
    @Profile("default")
    public HappyLifeService happyLifeServiceSimple(){
        return new HappyLifeSimpleImpl();
    }

    @Bean
    @Profile("forever")
    public HappyLifeService happyLifeServiceForever(){
        return new HappyLifeForeverImpl();
    }
}
