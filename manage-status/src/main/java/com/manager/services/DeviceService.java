package com.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.manager.entities.Televisao;

import org.springframework.stereotype.Service;

@Service
public class DeviceService {
    
    private List<Televisao> tvList = new ArrayList<>();

    public List<Televisao> listar() {
        return this.tvList;
    }

    public Televisao getTv(String id) {
        Televisao tv = tvList.stream()
                    .filter(t -> id.equals(t.getId()))
                    .findFirst()
                    .orElse(null);

        return tv;
    }

    public Televisao adicionar(Televisao tv) {
        tvList.add(tv);
        
        return tv;//Return confirmation or error
    }

    public Televisao atualizar(String id, Televisao tv) {
        int index = 0;
        for(Televisao tv1 : tvList){
            if(tv1.getId().equals(id)){
                tvList.set(index, tv);
                break;
            }
            index++;
        }

        return tvList.get(index); //Return confirmation or error
    }

    public void deleta(String id) {
        tvList.removeIf(t -> t.getId().equals(id)); 
    }

    //ControleRemoto
    public Televisao powerOnOff(String id, boolean estado) {
        return null;
    }

    public Televisao alterarVolume(String id, boolean estado) {
        return null;
    }

    public Televisao alterarCanal(String id, boolean estado) {
        return null;
    }

    public Televisao mudaCanal(String id, int canal) {
        return null;
    }

}
