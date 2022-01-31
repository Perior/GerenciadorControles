package com.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.manager.entities.ControleRemotoTelevisao;
import com.manager.entities.Televisao;

import org.springframework.stereotype.Service;

@Service
public class TelevisaoService {
    
    private List<ControleRemotoTelevisao> tvList = new ArrayList<>();

    public List<ControleRemotoTelevisao> listar() {
        return this.tvList;
    }

    public Televisao getTv(String id) {
        Televisao tv = tvList.stream()
                    .filter(t -> id.equals(t.getDevice().getId()))
                    .findFirst()
                    .orElse(null)
                    .getDevice();

        return tv;
    }

    public ControleRemotoTelevisao adicionar(Televisao tv) {
        ControleRemotoTelevisao controle = new ControleRemotoTelevisao(tv);
        tvList.add(controle);
        
        return controle;
    }

    public ControleRemotoTelevisao atualizar(String id, Televisao tv) {
        ControleRemotoTelevisao controle = new ControleRemotoTelevisao(tv);
        int index = 0;
        for(ControleRemotoTelevisao tv1 : tvList){
            if(tv1.getDevice().getId().equals(id)){
                tvList.set(index, controle);
                break;
            }
            index++;
        }

        return tvList.get(index);
    }

    public void deletar(String id) {
        tvList.removeIf(t -> t.getDevice().getId().equals(id)); 
    }

    public Televisao powerOnOff(String id, boolean estado) {
        Televisao tv = getTv(id);

        tv.setPower(estado);

        return tv;
    }

    public Televisao alterarVolume(String id, boolean estado) {
        Televisao tv = getTv(id);

        tv.setVolume(estado);

        return tv;
    }

    public Televisao alterarCanal(String id, boolean estado) {
        Televisao tv = getTv(id);

        tv.syntCanal(estado);

        return tv;
    }

    public Televisao mudaCanal(String id, int canal) {
        Televisao tv = getTv(id);

        tv.setCanal(canal);

        return tv;
    }

}
