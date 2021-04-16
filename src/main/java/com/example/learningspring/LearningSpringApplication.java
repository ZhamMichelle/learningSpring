package com.example.learningspring;

import com.example.learningspring.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(LearningSpringApplication.class, args);
        //InjectedByConstructedService constructedService=(InjectedByConstructedService)ctx.getBean("injectedByConstructedService");
        //constructedService.getMessage();

        GreetingController greetingController=(GreetingController) ctx.getBean("greetingController");
        greetingController.sayGreeting();
    }

}
