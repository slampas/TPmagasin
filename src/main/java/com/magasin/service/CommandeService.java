package com.magasin.service;

import java.util.List;

import com.magasin.model.Commande;

public interface CommandeService extends GenericService <Commande> {
	
	public Iterable<Commande> findByClientId(Long id);

}
