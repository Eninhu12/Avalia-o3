package com.a.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class MateriaPrima {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private int estoque;
	public MateriaPrima(String nome, int estoque) {
		this.id = getId();
		this.nome = nome;
		this.estoque =estoque;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
}
