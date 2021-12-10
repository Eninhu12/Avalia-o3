package com.a.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.domain.MateriaPrima;
import com.a.repositories.MateriaPrimaRepository;

@Service
public class MateriaPrimaService {
	@Autowired
	MateriaPrimaRepository repository;

	public void inserir(MateriaPrima m) {
		repository.save(m);
	}

	public MateriaPrima find(int id){ 
		return repository.findById(id).get(id);
	}
	public MateriaPrima alterar(int id,MateriaPrima m) {
		MateriaPrima a = find(id);
		a.setNome(a.getNome());
		a.setEstoque(a.getEstoque());
		repository.save(a);
		return a;

	}
	public void excluir(int id) {
		MateriaPrima a = find(id);
		if(a != null)
			repository.delete(a);
	}
	public List<MateriaPrima> all(){
		return repository.findAll();
	}
}
