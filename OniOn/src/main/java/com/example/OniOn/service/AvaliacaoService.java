package com.example.OniOn.service;

import com.example.OniOn.model.Avaliacao;
import com.example.OniOn.repository.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public Avaliacao salvar(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public List<Avaliacao> listar() {
        return avaliacaoRepository.findAll();
    }
}
