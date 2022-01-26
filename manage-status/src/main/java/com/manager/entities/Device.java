package com.manager.entities;


public abstract class Device {
    private boolean power;
    private MarcaEnum modelo;


    public Device(boolean power, int tempVol, MarcaEnum modelo) {
        this.power = power;
        this.modelo = modelo;
    }


    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public MarcaEnum getModelo() {
        return modelo;
    }

    public void setModelo(MarcaEnum modelo) {
        this.modelo = modelo;
    }

}
