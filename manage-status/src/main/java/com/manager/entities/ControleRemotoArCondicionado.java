package com.manager.entities;

public class ControleRemotoArCondicionado extends ControleRemotoBase<ArCondicionado> {
    
    public ControleRemotoArCondicionado(ArCondicionado ar){
        super(ar);
    }

    public void tempUp(){
        this.getDevice().setTemperatura(true);
        
    }
    public void tempDown(){
        this.getDevice().setTemperatura(false);
        
    }
}
