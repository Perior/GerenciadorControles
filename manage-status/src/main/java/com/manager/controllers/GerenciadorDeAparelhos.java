package com.manager.controllers;

import java.util.List;

import com.manager.entities.ArCondicionado;
import com.manager.entities.ControleRemotoArCondicionado;
import com.manager.entities.ControleRemotoTelevisao;
import com.manager.entities.Televisao;
import com.manager.services.ArCondicionadoService;
import com.manager.services.TelevisaoService;

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
    private TelevisaoService televisaoService;

    @Autowired
    private ArCondicionadoService arService;

    //Televisão
    @GetMapping("/televisores")
    public List<ControleRemotoTelevisao> allTv(){
        //Televisao tv = new Televisao(true, MarcaEnum.LG, 200);
        //televisaoService.adicionar(tv);
        
        List<ControleRemotoTelevisao> listaTv = televisaoService.listar();
        //Exception
        return listaTv;
    }

    @GetMapping("/televisores/{id}")
    public Televisao tv(@PathVariable("id") String id){
        //Exception
        return televisaoService.getTv(id);
    }

    @PostMapping("/televisores")
    public ControleRemotoTelevisao novaTv(@RequestBody Televisao tv) {
        //Exception
        return this.televisaoService.adicionar(tv);
    }

    @PutMapping("/televisores/{id}")
    public ControleRemotoTelevisao editarTv(@PathVariable("id") String id, @RequestBody Televisao tv) {
        return this.televisaoService.atualizar(id, tv);
    }

    @DeleteMapping("/televisores/{id}")
    public void deletaTv(@PathVariable("id") String id){
        televisaoService.deleta(id);
    }

    @PatchMapping("/televisores/{id}:ligar_desligar")
    public Televisao ligarDesligar(@PathVariable("id") String id, @RequestBody boolean power) {
        //Exception        
        return this.televisaoService.powerOnOff(id, power);
    }

    @PatchMapping("/televisores/{id}:controlar_volume")
    public Televisao controleVolume(@PathVariable("id") String id, @RequestBody boolean volume){
        return this.televisaoService.alterarVolume(id, volume);
    }

    @PatchMapping("/televisores/{id}:controlar_canal")
    public Televisao controleCanal(@PathVariable("id") String id, @RequestBody boolean canal){
        return this.televisaoService.alterarCanal(id, canal);
    }

    @PatchMapping("/televisores/{id}:muda_canal")
    public Televisao mudaCanal(@PathVariable("id") String id, @RequestBody int canal){
        return this.televisaoService.mudaCanal(id, canal);
    }

    
    //Ar Condicionado
    @GetMapping("/condicionadores")
    public List<ControleRemotoArCondicionado> allConditioner(){
        List<ControleRemotoArCondicionado> listaAr = arService.listar();

        return listaAr;
    }

    @GetMapping("/condicionadores/{id}")
    public ArCondicionado ar(@PathVariable("id") String id){
        //Exception
        return arService.getAr(id);
    }

    @PostMapping("/condicionadores")
    public ControleRemotoArCondicionado novoAr(@RequestBody ArCondicionado ar) {
        //Exception
        return this.arService.adicionar(ar);
    }

    @PutMapping("/condicionadores/{id}")
    public ControleRemotoArCondicionado editarAr(@PathVariable("id") String id, @RequestBody ArCondicionado ar) {
        //Exception        
        return this.arService.atualizar(id, ar);
    }

    @DeleteMapping("/condicionadores/{id}")
    public void deletaAr(@PathVariable("id") String id){
        arService.deleta(id);
    }

    @PatchMapping("/condicionadores/{id}:ligar_desligar")
    public ArCondicionado ligarDesligarAr(@PathVariable("id") String id, @RequestBody boolean power) {
        //Exception        
        return this.arService.powerOnOff(id, power);
    }

    @PatchMapping("/condicionadores/{id}:controlar_temperatura")
    public ArCondicionado controleTemperatura(@PathVariable("id") String id, @RequestBody boolean power) {
        //Exception        
        return this.arService.alterarTemperatura(id, power);
    }
}
