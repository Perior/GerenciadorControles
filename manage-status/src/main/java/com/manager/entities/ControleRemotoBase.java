package com.manager.entities;

import com.manager.exceptions.ModeloNullException;

public abstract class ControleRemotoBase<T extends Device> {

    private T device;

    public ControleRemotoBase(T device) throws ModeloNullException{
        if(device.marca() == null){
            throw new ModeloNullException();
        }
        this.device = device;
    }

    public void turnOn(){
        device.setPower(true);
        
    }

    public T getDevice() {
        return device;
    }

    public void setDevice(T device) {
        this.device = device;
    }

    public void turnOff(){
        device.setPower(false);
        
    }

    
    
}
