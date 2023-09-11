package com.generation.lojagames2.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.lojagames2.model.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByNomeJogoContainingIgnoreCase(@Param("nomeJogo") String nomeJogo);


}
