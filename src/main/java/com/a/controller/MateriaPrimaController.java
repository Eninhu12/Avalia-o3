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

import com.a.domain.MateriaPrima;
import com.a.services.MateriaPrimaService;


@RestController
@RequestMapping("/MateriaPrima")
public class MateriaPrimaController {
	
	
			@Autowired
			MateriaPrimaService service;
			
			
			@PostMapping("/inserir")
			public void inserir(@RequestBody MateriaPrima d) {
				service.inserir(d);
			}
			
			@GetMapping("/listar")
			public List<MateriaPrima> listaTodos(){
				return service.all();
			}
			
			
			@DeleteMapping("excluir/{id}")
			public void exclui(@PathVariable(name = "id") Integer id) {
				service.excluir(id);
			}
			
			@PutMapping("alterar/{id}")
			public MateriaPrima altera(@PathVariable(name = "id") Integer id, @RequestBody MateriaPrima d) {
				return service.alterar(id, d);
			}
		}


