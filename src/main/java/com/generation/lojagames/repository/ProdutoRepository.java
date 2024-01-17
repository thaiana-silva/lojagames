package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	 // Método para buscar produtos por nome
    List<Produto> findByNomeContainingIgnoreCase(String nome);

    // Método para buscar produtos por categoria
    List<Produto> findByDistribuidoraIgnoreCase(String distribuidora);
    
    
}
