package com.magasin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.model.Commande;
import com.magasin.repositorie.CommandeRepositorie;
import com.magasin.service.GenericService;




public class CommandeServiceImpl implements GenericService<Commande> {

	
	
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
		// TODO Auto-generated method stub
		return commandeRepositorie .save(entity);
	}

	@Override
	public Commande update(Commande entity) {
		// TODO Auto-generated method stub
		return commandeRepositorie.save(entity);
	}

	@Override
	public void delete(Long id) {
		this.commandeRepositorie.deleteById(id);;
		
	}
	
	


}
