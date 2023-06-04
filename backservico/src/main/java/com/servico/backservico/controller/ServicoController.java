package com.servico.backservico.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.servico.backservico.entity.Servico;
import com.servico.backservico.service.ServicoService;

@RestController
@RequestMapping("/api/servico")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;
    
    @GetMapping("/")
    private List<Servico> buscarTodos(){
        return servicoService.buscarTodos();
    }

    @GetMapping("/pagamentoPendente")
    public List<Servico> buscaServicosPagamentoPendente(){
        return servicoService.buscaServicosPagamentoPendente();
    }
    
    @GetMapping("/cancelados")
    public List<Servico> buscaServicosCancelados(){
        return servicoService.buscaServicosCancelados();
    }

    @PostMapping("/")
    public Servico inserir(@RequestBody Servico servico){
        return servicoService.inserir(servico);
    }

    @PutMapping("/")
    public Servico alterar(@RequestBody Servico servico){
        return servicoService.alterar(servico);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathParam("id") Long id){
        servicoService.excluir(id);
        return ResponseEntity.ok().build();
    }
}
