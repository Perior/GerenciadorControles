package com.manager.entities;

public class ControleRemotoArCondicionado extends ControleRemotoBase<ArCondicionado> {
    
    public ControleRemotoArCondicionado(ArCondicionado ar){
        super(ar);
    }

    public void tempUp(){
        this.getDevice().setTemperature(true);
        
    }
    public void tempDown(){
        this.getDevice().setTemperature(false);
        
    }
}
