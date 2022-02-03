package com.manager.entities;


public abstract class Device {
    private boolean power;
    private MarcaEnum modelo;


    public Device(boolean power, MarcaEnum modelo) {
        this.power = power;
        this.modelo = modelo;
    }


    public boolean getPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public MarcaEnum marca(){
        return modelo;
    }

    public String getModelo() {
        return modelo.getDescription();
    }

    public void setModelo(MarcaEnum modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "modelo=" + modelo.getDescription() + ", power=" + power;
    }

}
