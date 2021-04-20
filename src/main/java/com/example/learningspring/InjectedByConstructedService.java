//package com.example.learningspring;
//
//import com.example.learningspring.services.HappyLifeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class InjectedByConstructedService {
//    private HappyLifeService happyLifeService;
//
//    @Autowired  //начиная со Spring 4.0 аннотацию @Autowired можно не ставить на конструктор, если он единственный в классе
//    public InjectedByConstructedService(HappyLifeService happyLifeService) {
//        this.happyLifeService = happyLifeService;
//    }
//
//    public void getMessage(){
//        happyLifeService.happyLife();
//    }
//}
