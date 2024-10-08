package com.example.OniOn.service;

import com.example.OniOn.model.Receita;
import com.example.OniOn.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    @Autowired
    private ReceitaRepository receitaRepository;

    public Receita salvar(Receita receita) {
        return receitaRepository.save(receita);
    }

    public List<Receita> listar() {
        return receitaRepository.findAll();
    }

    public List<Receita> buscarPorCategoria(Long categoriaId) {
        return receitaRepository.findByCategoria_Id(categoriaId);
    }

    public List<Receita> buscarPorIngrediente(String ingredienteNome) {
        return receitaRepository.findByIngredientes_Nome(ingredienteNome);
    }
}
