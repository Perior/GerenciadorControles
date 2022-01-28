package com.manager.controllers;

import java.util.List;

import com.manager.entities.Televisao;
import com.manager.services.ControleRemotoTelevisao;
import com.manager.services.DeviceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class GerenciadorDeAparelhos {

    @Autowired
    private DeviceService deviceService;

    private ControleRemotoTelevisao controleTv;

    //Televisão
    @GetMapping("/televisores")
    public List<Televisao> all_tvs(){
        List<Televisao> listaTv = deviceService.listar();
        //Exception
        return listaTv;
    }

    @GetMapping("/televisores/{id}")
    public Televisao tv(@PathVariable("id") String id){
        //Exception
        return deviceService.getTv(id);
    }

    @PostMapping("/televisores")
    public Televisao novaTv(@RequestBody Televisao tv) {
        //Exception
        return this.deviceService.adicionar(tv);
    }

    @PutMapping("/televisores/{id}")
    public Televisao editarTv(@PathVariable("id") String id, @RequestBody Televisao tv) {
        //Exception        
        return this.deviceService.atualizar(id, tv);
    }

    @DeleteMapping("/televisores/{id}")
    public void deletaTv(@PathVariable("id") String id){
        deviceService.deleta(id);
    }

    @PatchMapping("/televisores/{id}")
    public Televisao ligarDesligar(@PathVariable("id") String id, @RequestBody boolean estado) {
        //Exception        
        return this.deviceService.powerOnOff(id, estado);
    }

    @PatchMapping("/televisores/{id}")
    public Televisao controleVolume(@PathVariable("id") String id, @RequestBody boolean estado){
        return this.deviceService.alterarVolume(id, estado);
    }

    @PatchMapping("/televisores/{id}")
    public Televisao controleCanal(@PathVariable("id") String id, @RequestBody boolean estado){
        return this.deviceService.alterarCanal(id, estado);
    }

    @PatchMapping("/televisores/{id}")
    public Televisao mudaCanal(@PathVariable("id") String id, @RequestBody int canal){
        return this.deviceService.mudaCanal(id, canal);
    }
    
}
