package com.a.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.a.domain.Insumo;
import com.a.repositories.InsumoRepository;

public class InsumoService {
	@Autowired
	InsumoRepository repository;

	public void inserir(Insumo m) {
		repository.save(m);
	}
}
