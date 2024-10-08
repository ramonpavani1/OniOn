package com.example.OniOn.controller;

import com.example.OniOn.model.Ingrediente;
import com.example.OniOn.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredientes")
public class IngredienteController {
    @Autowired
    private IngredienteService ingredienteService;

    @PostMapping
    public Ingrediente criarIngrediente(@RequestBody Ingrediente ingrediente) {
        return ingredienteService.salvar(ingrediente);
    }

    @GetMapping
    public List<Ingrediente> listarIngredientes() {
        return ingredienteService.listar();
    }
}
