package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Musica;
import com.example.demo.service.MusicaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MusicaController {
    @Autowired
    private MusicaService servico;

    @PostMapping
    public Musica criarProduto(@RequestBody Musica musica) {
        return servico.criarMusica(musica);
    }

    @GetMapping
    public List<Musica> obterTodos() {
        return servico.obterTodos();
    }
    
    
}
