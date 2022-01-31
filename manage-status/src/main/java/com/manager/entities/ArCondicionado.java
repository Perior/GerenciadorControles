package com.manager.entities;

public class ArCondicionado extends Device{
    private int temperature;
    
    
    public ArCondicionado(boolean power, MarcaEnum modelo) {
        super(power, modelo);
        this.temperature = 26;
    }
    

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(boolean syntTemp) {

        if(syntTemp){
            if(this.temperature < 28)
                this.temperature++;
        }
        else{
            if(this.temperature > 16)
                this.temperature--;
        }
        
    }


    @Override
    public String toString() {
        return "ArCondicionado [" + super.toString() + ", temperature=" + temperature + "]";
    }

    

}
