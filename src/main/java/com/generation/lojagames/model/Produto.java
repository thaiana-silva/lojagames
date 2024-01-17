package com.generation.lojagames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name ="tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=5, max = 100, message = "O Nome deve ter no minimo 5 caracteres e no maximo 100")
	@NotBlank(message = "Atributo nome é obrigatório")
    private String nome;
    
    @Size(min=2, max = 10, message = "A classificação deve ter no minimo 2 caracteres e no maximo 10")
	@NotBlank(message = "Atributo classificação é obrigatório")
    private String classificacao;
    
    private double preco;
    
    @Size(min=5, max = 1000, message = "A descrição deve ter no minimo 5 caracteres e no maximo 100")
	@NotBlank(message = "Atributo descrição é obrigatório")
    private String descricao;
    
    @Size(min=5, max = 100, message = "O nome do Desenvolvedor deve ter no minimo 5 caracteres e no maximo 100")
	@NotBlank(message = "Atributo desenvolvedor é obrigatório")
    private String desenvolvedor;
    
    @Size(min=5, max = 100, message = "O nome da Distribuidora deve ter no minimo 5 caracteres e no maximo 100")
	@NotBlank(message = "Atributo distribuidora é obrigatório")
    private String distribuidora;
    
    private String dataLancamento;
    
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

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getDistribuidora() {
		return distribuidora;
	}

	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
