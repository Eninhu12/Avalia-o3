package com.a.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Produto {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private Double valor;
	public Produto(String nome, Double valor) {
		this.id = getId();
		this.nome = nome;
		this.valor = valor;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}