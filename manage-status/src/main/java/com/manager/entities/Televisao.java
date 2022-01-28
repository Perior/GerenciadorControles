package com.manager.entities;

public class Televisao extends Device{
    private int volume;
    private int totalCanal;
    private int canal;


    public Televisao(boolean power, MarcaEnum modelo, int totalCanal, int canal) {
        super(power, modelo);
        this.totalCanal = totalCanal;
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(boolean syntCanal) {
        
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

}
