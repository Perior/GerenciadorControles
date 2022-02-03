package com.manager.entities;

public class ArCondicionado extends Device{
    private int temperatura;
    
    
    public ArCondicionado(boolean power, MarcaEnum modelo) {
        super(power, modelo);
        this.temperatura = 26;
    }
    

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(boolean syntTemp) {

        if(syntTemp){
            if(this.temperatura < 28)
                this.temperatura++;
        }
        else{
            if(this.temperatura > 16)
                this.temperatura--;
        }
        
    }


    @Override
    public String toString() {
        return "ArCondicionado [" + super.toString() + ", temperatura=" + temperatura + "]";
    }
}
