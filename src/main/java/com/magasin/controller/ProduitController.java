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

import com.magasin.model.Produit;
import com.magasin.service.GenericService;


@RestController
@RequestMapping("produits")
public class ProduitController {
	
	
	
	@Autowired
	private GenericService<Produit> genericService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Produit> getALL() {
		return genericService.findAll(); 
	}
	@GetMapping("{id}")
	public Produit getbyId(@PathVariable Long id) {
		return this.genericService.findById(id);
		
	}
	
	@PostMapping()
	public Produit save(@RequestBody Produit v ) {

		return genericService.save(v) ;
	}
	
	@PatchMapping()
	public Produit update( @RequestBody Produit v) {
		return this.genericService.update(v);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long v) {
		this.genericService.delete(v);
		
	}

}
