package com.manager.entities;

public abstract class ControleRemotoBase<T extends Device> {

    private T device;

    public ControleRemotoBase(T device){
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
