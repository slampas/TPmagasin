package com.magasin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magasin.model.Categorie;
import com.magasin.service.GenericService;


@RestController
@RequestMapping("categories")
public class CategorieController {
	
	
	
	@Autowired
	private GenericService<Categorie> genericService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Categorie> getALL() {
		return genericService.findAll(); 
	}
	@GetMapping("{id}")
	public Categorie getbyId(@PathVariable Long id) {
		return this.genericService.findById(id);
		
	}
	
	@PostMapping()
	public Categorie save(@RequestBody Categorie v ) {

		return genericService.save(v) ;
	}
	
	@PatchMapping()
	public Categorie update( @RequestBody Categorie v) {
		return this.genericService.update(v);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long v) {
		this.genericService.delete(v);
		
	}

}
