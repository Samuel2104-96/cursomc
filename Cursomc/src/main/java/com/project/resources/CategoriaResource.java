package com.project.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.domain.Categoria;
import com.project.services.CategoriaService;



@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService Service;
	
	
@RequestMapping(value = "/{id}", method=RequestMethod.GET)
public ResponseEntity<Categoria> find(@PathVariable Integer id) {
		
		Categoria obj = Service.find(id);
		 return ResponseEntity.ok().body(obj) ;
	
	

 }
} 