package com.manager.entities;

import com.manager.exceptions.ModeloNullException;
import com.manager.util.RandomString;

public abstract class ControleRemotoBase<T extends Device> {

    private String id;
    private T device;

    public ControleRemotoBase(T device) throws ModeloNullException{
        if(device.marca() == null){
            throw new ModeloNullException();
        }
        this.id = RandomString.getAlphaNumericString(4);
        this.device = device;
    }

    public String getId() {
        return id;
    }

    public void turnPower(){
        device.setPower();
    }

    public T getDevice() {
        return device;
    }

    public void setDevice(T device) {
        this.device = device;
    }
}
