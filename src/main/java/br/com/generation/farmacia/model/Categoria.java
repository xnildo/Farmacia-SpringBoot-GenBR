package br.com.generation.farmacia.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //SERA UMA ENTIDADE DO JPA
@Table(name = "categoria") //CRIAÇÃO DA TABELA CATEGORIA
public class Categoria {
	
	//ATRIBUTOS E MÉTODOS
	@Id // ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO-INCREMENTO
	private long id;
	
	@NotNull
	private String categoria;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")//VAI IGNORAR O ATRIBUTOS CATEGORIAS
	private List<Produto> produto;
	
	public long getId() {
		return id;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
}
