package com.manager.entities;

public class ArCondicionado extends Device{
    private int temperature;
    
    
    public ArCondicionado(boolean power, int tempVol, MarcaEnum modelo) {
        super(power, tempVol, modelo);
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

}
