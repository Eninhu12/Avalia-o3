package com.a.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Insumo {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMateria;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProduto;
	private int quant;
	
	public int getQuant() {
		return quant;
	}

	public Insumo(int materia,int p,int quant) {
		this.idMateria=materia;
		this.idProduto=p;
		this.quant=quant;
	}
	
	public void alterar(int materia,int p,int quant) {
		this.idMateria = materia;
		this.idProduto = p;
		this.quant=quant;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public int getIdMateria() {
		return idMateria;
	}
}