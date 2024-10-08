package com.example.OniOn.repository;

import com.example.OniOn.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
    List<Receita> findByCategoria_Id(Long categoriaId);
    List<Receita> findByIngredientes_Nome(String ingredienteNome);
}
