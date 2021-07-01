package br.com.generation.farmacia.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {
	
	//ATRIBUTOS E MÉTODOS
	@Id // ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO-INCREMENTO
	private long id;

	@NotNull
	private String nome;
	
	@NotNull
	private String marca;
	
	@NotNull
	private double preco;
	
	@ManyToOne //FAZENDO RELAÇAO DESSA TABLEA COM A TABELA TEMA 
	@JsonIgnoreProperties("produto")//	VAI IGNORAR O ATRIBUTOS PRODUTO 
	private Categoria categoria;
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	
}
