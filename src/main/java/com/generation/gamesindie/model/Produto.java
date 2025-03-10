package com.generation.gamesindie.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "É obrigatório que o campo \"nome\" seja preenchido!")
	@Size(min = 3, max = 100, message = "O campo \"nome\" precisa ter até 100 caracteres!")
	private String nome;
	
	@NotBlank(message = "É obrigatório que o campo \"descrição\" seja preenchido!")
	@Size(min = 3, max = 500, message = "O campo \"descrição\" precisa ter até 100 caracteres!")
	private String descricao;
	
	@NotBlank(message = "É obrigatório que o campo \"produtora\" seja preenchido!")
	@Size(min = 3, max = 100, message = "O campo \"produtora\" precisa ter até 100 caracteres!")
	private String produtora;
	
	@NotNull(message = "É obrigatório que o campo \"data de lançamento\" seja preenchido!")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataLancamento;
	
	@NotNull
	private double preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public LocalDate getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(LocalDate dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
