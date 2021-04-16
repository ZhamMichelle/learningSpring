package com.example.learningspring.services;

public class HappyLifeFactory {
    public HappyLifeService happyLifeService(String degree){
        HappyLifeService service = null;

        switch(degree){
            case "simple":
                service=new HappyLifeSimpleImpl();
                break;
            case "average":
                service=new HappyLifeAverageImpl();
                break;
            case "middle":
                service=new HappyLifeMiddleImpl();
                break;
            case "forever":
                service=new HappyLifeForeverImpl();
                break;
            default: new HappyLifeSimpleImpl();
        }
        
        return service;
    }
}
