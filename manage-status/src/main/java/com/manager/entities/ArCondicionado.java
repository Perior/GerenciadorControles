package com.manager.entities;
import org.springframework.stereotype.Component;


@Component
public class ArCondicionado extends Device{
    
    public ArCondicionado(boolean power, int tempVol, EMarca modelo) {
        super(power, tempVol, modelo);
    }


    @Override
    void setTempVol(boolean syntTempVol) {

        if(syntTempVol){
            if(this.tempVol < 28)
                this.tempVol++;
        }
        else{
            if(this.tempVol > 16)
                this.tempVol--;
        }
        
    }

}
