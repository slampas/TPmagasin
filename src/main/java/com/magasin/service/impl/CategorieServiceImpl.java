package com.magasin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.model.Categorie;
import com.magasin.repositorie.CategorieRepositorie;
import com.magasin.service.GenericService;




public class CategorieServiceImpl implements GenericService<Categorie> {

	
	
	@Autowired
	private CategorieRepositorie categorieRepositorie  ;

	
	
	
	@Override
	public List<Categorie> findAll() {
		// TODO Auto-generated method stub
		return categorieRepositorie.findAll();
	}

	@Override
	public Categorie findById(Long id) {
		// TODO Auto-generated method stub
		return categorieRepositorie.findById(id).get() ;
	}

	@Override
	public Categorie save(Categorie entity) {
		// TODO Auto-generated method stub
		return categorieRepositorie .save(entity);
	}

	@Override
	public Categorie update(Categorie entity) {
		// TODO Auto-generated method stub
		return categorieRepositorie.save(entity);
	}

	@Override
	public void delete(Long id) {
		this.categorieRepositorie.deleteById(id);;
		
	}
	
	


}
