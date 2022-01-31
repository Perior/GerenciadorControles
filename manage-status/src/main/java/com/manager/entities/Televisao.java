package com.manager.entities;

public class Televisao extends Device{
    private int volume;
    private int totalCanal;
    private int canal;


    public Televisao(boolean power, MarcaEnum modelo, int totalCanal) {
        super(power, modelo);
        this.volume = 10;
        this.totalCanal = totalCanal;
        this.canal = 1;
    }

    public int getCanal() {
        return canal;
    }

    public void syntCanal(boolean syntCanal) {
        
        if(syntCanal){
            if(canal < totalCanal)
                this.canal++;
        }
        else{
            if(canal > 1)
                this.canal--;
        }
    }

    public void setCanal(int changeCanal) {

        if(changeCanal > 0 && changeCanal <= totalCanal){
            this.canal = changeCanal;
        }
        else{
            //throw exception "Canal não disponível"
        }

    }

    public int getTotalCanal() {
        return totalCanal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(boolean syntVol) {

        if(syntVol){
            if(this.volume < 100)
                this.volume++;
        }
        else{
            if(this.volume > 0)
                this.volume--;
        }
        
    }

    @Override
    public String toString() {
        return "Televisao [" + super.toString() + ", canal=" + canal + ", totalCanal=" + totalCanal + ", volume=" + volume + "]";
    }

}
