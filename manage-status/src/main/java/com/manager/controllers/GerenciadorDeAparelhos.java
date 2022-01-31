package com.manager.controllers;

import java.util.List;

import com.manager.entities.ArCondicionado;
import com.manager.entities.ControleRemotoArCondicionado;
import com.manager.entities.ControleRemotoTelevisao;
import com.manager.entities.Televisao;
import com.manager.exceptions.ModeloNullException;
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
    private ArCondicionadoService arCondicionadoService;

    //Televisão
    @GetMapping("/televisores")
    public List<ControleRemotoTelevisao> listarTvs(){        
        List<ControleRemotoTelevisao> listaTv = televisaoService.listar();
        return listaTv;
    }

    @GetMapping("/televisores/{id}")
    public Televisao visualizarTv(@PathVariable("id") String id){
        return televisaoService.getTv(id);
    }

    @PostMapping("/televisores")
    public ControleRemotoTelevisao novaTv(@RequestBody Televisao tv) throws ModeloNullException {
        return this.televisaoService.adicionar(tv);
    }

    @PutMapping("/televisores/{id}")
    public ControleRemotoTelevisao editarTv(@PathVariable("id") String id, @RequestBody Televisao tv) throws ModeloNullException {
        return this.televisaoService.atualizar(id, tv);
    }

    @DeleteMapping("/televisores/{id}")
    public void deletarTv(@PathVariable("id") String id){
        televisaoService.deletar(id);
    }

    @PatchMapping("/televisores/{id}:ligar_desligar")
    public Televisao ligarDesligarTv(@PathVariable("id") String id, @RequestBody boolean power) {        
        return this.televisaoService.powerOnOff(id, power);
    }

    @PatchMapping("/televisores/{id}:controlar_volume")
    public Televisao controlarVolume(@PathVariable("id") String id, @RequestBody boolean volume){
        return this.televisaoService.alterarVolume(id, volume);
    }

    @PatchMapping("/televisores/{id}:controlar_canal")
    public Televisao controlarCanal(@PathVariable("id") String id, @RequestBody boolean canal){
        return this.televisaoService.alterarCanal(id, canal);
    }

    @PatchMapping("/televisores/{id}:muda_canal")
    public Televisao mudarCanal(@PathVariable("id") String id, @RequestBody int canal){
        return this.televisaoService.mudaCanal(id, canal);
    }

    
    //Ar Condicionado
    @GetMapping("/condicionadores")
    public List<ControleRemotoArCondicionado> listarArCondicionados(){
        List<ControleRemotoArCondicionado> listaAr = arCondicionadoService.listar();

        return listaAr;
    }

    @GetMapping("/condicionadores/{id}")
    public ArCondicionado visualizarArCondicionados(@PathVariable("id") String id){
        return arCondicionadoService.getAr(id);
    }

    @PostMapping("/condicionadores")
    public ControleRemotoArCondicionado novoAr(@RequestBody ArCondicionado ar) throws ModeloNullException {
        return this.arCondicionadoService.adicionar(ar);
    }

    @PutMapping("/condicionadores/{id}")
    public ControleRemotoArCondicionado editarAr(@PathVariable("id") String id, @RequestBody ArCondicionado ar) throws ModeloNullException {        
        return this.arCondicionadoService.atualizar(id, ar);
    }

    @DeleteMapping("/condicionadores/{id}")
    public void deletarAr(@PathVariable("id") String id){
        arCondicionadoService.deletar(id);
    }

    @PatchMapping("/condicionadores/{id}:ligar_desligar")
    public ArCondicionado ligarDesligarAr(@PathVariable("id") String id, @RequestBody boolean power) {        
        return this.arCondicionadoService.powerOnOff(id, power);
    }

    @PatchMapping("/condicionadores/{id}:controlar_temperatura")
    public ArCondicionado controleTemperatura(@PathVariable("id") String id, @RequestBody boolean temperatura) {        
        return this.arCondicionadoService.alterarTemperatura(id, temperatura);
    }
}
