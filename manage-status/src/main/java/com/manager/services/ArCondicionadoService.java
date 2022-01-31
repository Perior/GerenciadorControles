package com.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.manager.entities.ArCondicionado;
import com.manager.entities.ControleRemotoArCondicionado;

import org.springframework.stereotype.Service;

@Service
public class ArCondicionadoService {

    private List<ControleRemotoArCondicionado> arList = new ArrayList<>();

    public List<ControleRemotoArCondicionado> listar() {
        return this.arList;
    }

    public ArCondicionado getAr(String id) {
        ArCondicionado ar = arList.stream()
                    .filter(t -> id.equals(t.getDevice().getId()))
                    .findFirst()
                    .orElse(null)
                    .getDevice();

        return ar;
    }

    public ControleRemotoArCondicionado adicionar(ArCondicionado ar) {
        ControleRemotoArCondicionado controle = new ControleRemotoArCondicionado(ar);
        arList.add(controle);
        
        return controle;
    }

    public ControleRemotoArCondicionado atualizar(String id, ArCondicionado ar) {
        ControleRemotoArCondicionado controle = new ControleRemotoArCondicionado(ar);
        int index = 0;
        for(ControleRemotoArCondicionado ar1 : arList){
            if(ar1.getDevice().getId().equals(id)){
                arList.set(index, controle);
                break;
            }
            index++;
        }

        return arList.get(index);
    }

    public void deletar(String id) {
        
        arList.removeIf(t -> t.getDevice().getId().equals(id)); 
    }

    public ArCondicionado powerOnOff(String id, boolean estado) {
        ArCondicionado ar = getAr(id);

        ar.setPower(estado);

        return ar;
    }

    public ArCondicionado alterarTemperatura(String id, boolean estado) {
        ArCondicionado ar = getAr(id);

        ar.setTemperatura(estado);

        return ar;
    }
    
}
