package com.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a.domain.Insumo;
import com.a.services.InsumoService;

@RestController
@RequestMapping("/Insumo")

public class InsumoController {
	@Autowired
	InsumoService service;
	
	@PostMapping("/inserir")
	public void inserir(@RequestBody Insumo d) {
		service.inserir(d);
	}
}
