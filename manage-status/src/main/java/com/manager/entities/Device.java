package com.manager.entities;
import org.springframework.stereotype.Component;


@Component
public abstract class Device {
    protected boolean power;
    protected int tempVol;

    protected EMarca modelo;


    public Device(boolean power, int tempVol, EMarca modelo) {
        this.power = power;
        this.tempVol = tempVol;
        this.modelo = modelo;
    }


    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public EMarca getModelo() {
        return modelo;
    }

    public void setModelo(EMarca modelo) {
        this.modelo = modelo;
    }

    public int getTempVol() {
        return tempVol;
    }

    abstract void setTempVol(boolean syntTempVol);

}
