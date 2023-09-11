package com.generation.lojagames2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produto")

public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Atributo nomeJogo é obrigatório")
	@Size(min=4, max= 245, message = "Nome do jogo obrigatorio")
	private String nomeJogo;
	
	@NotBlank(message = "O Atributo Descrição é obrigatório")
	@Size(min=1 , max =5000 , message="Descrição do jogo é obrigatorio")
	private String descricaojogo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getDescricaojogo() {
		return descricaojogo;
	}

	public void setDescricaojogo(String descricaojogo) {
		this.descricaojogo = descricaojogo;
	}

	

}
