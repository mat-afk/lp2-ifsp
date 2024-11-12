package model;

import java.util.UUID;

public class Produto {

	private String id;
	private String nome;
	private String descricao;
	private String imagem;
	private Double preco;
	
	public Produto() {
		this.setId("");
		this.nome = "";
		this.descricao = "";
		this.imagem = "";
		this.preco = 0.0;
	}
	
	public Produto(String id, String nome, String descricao, String imagem, Double preco) {
		this.setId(id);
		this.nome = nome;
		this.descricao = descricao;
		this.imagem = imagem;
		this.preco = preco;
	}
	
	public Produto(String nome, String descricao, String imagem, Double preco) {
		this(UUID.randomUUID().toString(), nome, descricao, imagem, preco);
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}	
}
