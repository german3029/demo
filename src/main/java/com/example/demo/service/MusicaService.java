package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Musica;
import com.example.demo.repository.MusicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MusicaService {

    @Autowired
    private MusicaRepository repositorio;

    public Musica criarMusica(Musica musica) {
        return repositorio.save(musica);
    }

    public List<Musica> obterTodos() {
        return repositorio.findAll();
    }
    
}
