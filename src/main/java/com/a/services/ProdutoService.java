package com.a.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.domain.Produto;
import com.a.repositories.ProdutoRepository;
@Service
public class ProdutoService {
	@Autowired
	ProdutoRepository repository;

	public void inserir(Produto m) {
		repository.save(m);
	}

	public Produto find(int id){ 
		return repository.findById(id).get(id);
	}
	public Produto alterar(int id,Produto m) {
		Produto a = find(id);
		a.setNome(a.getNome());
		a.setValor(a.getValor());
		repository.save(a);
		return a;

	}
	public void excluir(int id) {
		Produto a = find(id);
		if(a != null)
			repository.delete(a);
	}
	public List<Produto> all(){
		return repository.findAll();
	}
}
