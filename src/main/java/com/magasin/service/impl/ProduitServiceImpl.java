package com.magasin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.model.Produit;
import com.magasin.repositorie.ProduitRepositorie;
import com.magasin.service.GenericService;




public class ProduitServiceImpl implements GenericService<Produit> {

	
	
	@Autowired
	private ProduitRepositorie produitRepositorie  ;

	
	
	
	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitRepositorie.findAll();
	}

	@Override
	public Produit findById(Long id) {
		// TODO Auto-generated method stub
		return produitRepositorie.findById(id).get() ;
	}

	@Override
	public Produit save(Produit entity) {
		// TODO Auto-generated method stub
		return produitRepositorie .save(entity);
	}

	@Override
	public Produit update(Produit entity) {
		// TODO Auto-generated method stub
		return produitRepositorie.save(entity);
	}

	@Override
	public void delete(Long id) {
		this.produitRepositorie.deleteById(id);;
		
	}
	
	


}
