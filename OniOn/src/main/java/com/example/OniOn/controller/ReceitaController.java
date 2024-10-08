package com.example.OniOn.controller;

import com.example.OniOn.model.Receita;
import com.example.OniOn.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaController {
    @Autowired
    private ReceitaService receitaService;

    @PostMapping
    public Receita criarReceita(@RequestBody Receita receita) {
        return receitaService.salvar(receita);
    }

    @GetMapping
    public List<Receita> listarReceitas() {
        return receitaService.listar();
    }

    @GetMapping("/categoria/{categoriaId}")
    public List<Receita> buscarPorCategoria(@PathVariable Long categoriaId) {
        return receitaService.buscarPorCategoria(categoriaId);
    }

    @GetMapping("/ingrediente/{ingredienteNome}")
    public List<Receita> buscarPorIngrediente(@PathVariable String ingredienteNome) {
        return receitaService.buscarPorIngrediente(ingredienteNome);
    }
}
