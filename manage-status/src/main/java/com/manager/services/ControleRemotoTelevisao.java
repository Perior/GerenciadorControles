package com.manager.services;

import com.manager.entities.Televisao;

public class ControleRemotoTelevisao {

    public void turnOn(Televisao tv){
        tv.setPower(true);
        
    } 

    public void turnOff(Televisao tv){
        tv.setPower(false);
        
    }

    public void volumeUp(Televisao tv){
        tv.setVolume(true);
        
    }
    public void volumeDown(Televisao tv){
        tv.setVolume(false);
        
    }

    public void canalUp(Televisao tv){
        tv.setCanal(true);
        
    }
    public void canalDown(Televisao tv){
        tv.setCanal(false);
        
    }

    public void changeCanal(Televisao tv, int canal){
        tv.setCanal(canal);
    }
    
}