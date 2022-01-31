package com.manager.entities;

import com.manager.exceptions.ModeloNullException;

public class ControleRemotoTelevisao extends ControleRemotoBase<Televisao>{

    public ControleRemotoTelevisao(Televisao tv) throws ModeloNullException{
        super(tv);
        
    }


    public void volumeUp(){
        this.getDevice().setVolume(true);
        
    }
    public void volumeDown(){
        this.getDevice().setVolume(false);
        
    }

    public void canalUp(){
        this.getDevice().syntCanal(true);
        
    }
    public void canalDown(){
        this.getDevice().syntCanal(false);
        
    }

    public void changeCanal(int canal){
        this.getDevice().setCanal(canal);
    }


    @Override
    public String toString() {
        return "ControleRemotoTelevisao [" + getDevice().toString() + "]";
    }

    
}
