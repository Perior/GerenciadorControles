package com.manager.entities;

import com.manager.util.RandomString;

public abstract class Device {
    private String id;
    private boolean power;
    private MarcaEnum modelo;


    public Device(boolean power, MarcaEnum modelo) {
        this.id = RandomString.getAlphaNumericString(4);
        this.power = power;
        this.modelo = modelo;
    }

    public String getId(){
        return id;
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
        return "id=" + id + ", modelo=" + modelo.getDescription() + ", power=" + power;
    }

}
