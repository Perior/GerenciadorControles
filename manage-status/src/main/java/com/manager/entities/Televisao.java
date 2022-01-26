package com.manager.entities;
import org.springframework.stereotype.Component;


@Component
public class Televisao extends Device{
    private int totalCanal;
    private int canal;


    public Televisao(boolean power, int tempVol, EMarca modelo, int totalCanal, int canal) {
        super(power, tempVol, modelo);
        this.totalCanal = totalCanal;
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(boolean syntCanal) {
        
        if(syntCanal){
            if(canal < totalCanal)
                canal++;
        }
        else{
            if(canal > 1)
                canal--;
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

    @Override
    void setTempVol(boolean syntTempVol) {

        if(syntTempVol){
            if(this.tempVol < 100)
                this.tempVol++;
        }
        else{
            if(this.tempVol > 0)
                this.tempVol--;
        }
        
    }

}
