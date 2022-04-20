package com.manager.services;

import java.util.ArrayList;
import java.util.List;

import com.manager.entities.MarcaEnum;

import org.springframework.stereotype.Service;

@Service
public class MarcaService {
    private List<String> listaMarcas = new ArrayList<String>();

    public List<String> getMarcas() {
        if (listaMarcas.isEmpty()) {
            MarcaEnum[] teste = MarcaEnum.values();
            for (MarcaEnum marcaEnum : teste) {
                listaMarcas.add(marcaEnum.getDescription());
            }
        }

        return listaMarcas;
    }
}
