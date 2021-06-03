package com.magasin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.magasin.model.Client;
import com.magasin.repositorie.ClientRepositorie;
import com.magasin.service.GenericService;




public class ClientServiceImpl implements GenericService<Client> {

	
	
	@Autowired
	private ClientRepositorie clientRepositorie  ;

	
	
	
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientRepositorie.findAll();
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return clientRepositorie.findById(id).get() ;
	}

	@Override
	public Client save(Client entity) {
		// TODO Auto-generated method stub
		return clientRepositorie .save(entity);
	}

	@Override
	public Client update(Client entity) {
		// TODO Auto-generated method stub
		return clientRepositorie.save(entity);
	}

	@Override
	public void delete(Long id) {
		this.clientRepositorie.deleteById(id);;
		
	}
	
	


}
