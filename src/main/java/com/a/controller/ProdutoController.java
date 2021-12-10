package com.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a.domain.Produto;
import com.a.services.ProdutoService;

public class ProdutoController {
	@RestController
	@RequestMapping("/Produto")
	public class MateriaPrimaController {
		
		
				@Autowired
				ProdutoService service;
				
				
				@PostMapping("/inserir")
				public void inserir(@RequestBody Produto d) {
					service.inserir(d);
				}
				
				@GetMapping("/listar")
				public List<Produto> listaTodos(){
					return service.all();
				}
				
				
				@DeleteMapping("excluir/{id}")
				public void exclui(@PathVariable(name = "id") Integer id) {
					service.excluir(id);
				}
				
				@PutMapping("alterar/{id}")
				public Produto altera(@PathVariable(name = "id") Integer id, @RequestBody Produto d) {
					return service.alterar(id, d);
				}
			}
}
