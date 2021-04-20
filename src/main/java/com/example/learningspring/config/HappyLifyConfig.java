package com.example.learningspring.config;

import com.example.learningspring.services.HappyLifeFactory;
import com.example.learningspring.services.HappyLifeService;
import com.example.learningspring.services.HappyLifeSimpleImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HappyLifyConfig {

    @Bean
    public HappyLifeFactory happyLifeFactory(){
        return new HappyLifeFactory();
    }

    @Bean
    @Profile("simple")
    @Primary
    public HappyLifeService happyLifeServiceSimple(HappyLifeFactory factory){
        return factory.createHappyLifeService("simple");
    }

    @Bean
    public HappyLifeService happyLifeServiceForever(HappyLifeFactory factory){
        return factory.createHappyLifeService("forever");
    }

    @Bean(name="middle")
    public HappyLifeService happyLifeServiceMiddle(HappyLifeFactory factory){
        return factory.createHappyLifeService("middle");
    }

    @Bean
    @Profile("average")
    @Primary
    public HappyLifeService happyLifeServiceAverage(HappyLifeFactory factory){
        return factory.createHappyLifeService("average");
    }

}
