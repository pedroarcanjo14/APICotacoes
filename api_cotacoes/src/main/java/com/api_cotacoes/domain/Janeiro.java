package com.api_cotacoes.domain;


public class Janeiro {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
public String nome;

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String cotacao;

public String getCotacao() {
	return cotacao;
}

public void setCotacao(String cotacao) {
	this.cotacao = cotacao;
}

}
