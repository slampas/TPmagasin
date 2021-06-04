package com.magasin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.model.Commande;
import com.magasin.repositorie.CommandeRepositorie;
import com.magasin.service.CommandeService;
import com.magasin.service.GenericService;




public class CommandeServiceImpl implements CommandeService {

	
	
	@Autowired
	private CommandeRepositorie commandeRepositorie  ;

	
	
	
	@Override
	public List<Commande> findAll() {
		// TODO Auto-generated method stub
		return commandeRepositorie.findAll();
	}

	@Override
	public Commande findById(Long id) {
		// TODO Auto-generated method stub
		return commandeRepositorie.findById(id).get() ;
	}

	@Override
	public Commande save(Commande entity) {
		return commandeRepositorie .save(entity);
	}

	@Override
	public Commande update(Commande entity) {
		return commandeRepositorie.save(entity);
	}

	@Override
	public void delete(Long id) {
		this.commandeRepositorie.deleteById(id);;
		
	}
	
	public Iterable<Commande> findByClientId(Long id) {
		return this.commandeRepositorie.findByClientId(id);
	}
	
	


}
