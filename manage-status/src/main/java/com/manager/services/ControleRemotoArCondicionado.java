package com.manager.services;

import com.manager.entities.ArCondicionado;

public class ControleRemotoArCondicionado {


    public void turnOn(ArCondicionado ar){
        ar.setPower(true);
        
    } 

    public void turnOff(ArCondicionado ar){
        ar.setPower(false);
        
    }

    public void tempUp(ArCondicionado ar){
        ar.setTemperature(true);
        
    }
    public void tempDown(ArCondicionado ar){
        ar.setTemperature(false);
        
    }
    
}