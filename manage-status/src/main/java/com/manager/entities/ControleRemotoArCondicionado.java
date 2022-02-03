package com.manager.entities;

import com.manager.exceptions.ModeloNullException;

public class ControleRemotoArCondicionado extends ControleRemotoBase<ArCondicionado> {
    
    public ControleRemotoArCondicionado(ArCondicionado ar) throws ModeloNullException{
        super(ar);
    }


    public void tempUp(){
        this.getDevice().setTemperatura(true);
        
    }

    public void tempDown(){
        this.getDevice().setTemperatura(false);    
    }
}
