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

import com.magasin.model.Commande;
import com.magasin.service.CommandeService;



@RestController
@RequestMapping("commandes")
public class CommandeController {
	
	
	
	@Autowired
	private CommandeService commandeService;
	
	
	
	
	
	
	
	@GetMapping()
	public List<Commande> getALL() {
		return commandeService.findAll(); 
	}
	@GetMapping("{id}")
	public Commande getbyId(@PathVariable Long id) {
		return this.commandeService.findById(id);
		
	}
	
	@GetMapping("clients/{id}")
	public Iterable<Commande> findByClientId(@PathVariable Long id) {
		return this.commandeService.findByClientId(id);
	}
	
	
	@PostMapping()
	public Commande save(@RequestBody Commande v ) {

		return commandeService.save(v) ;
	}
	
	@PatchMapping()
	public Commande update( @RequestBody Commande v) {
		return this.commandeService.update(v);
		
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long v) {
		this.commandeService.delete(v);
		
	}

}
