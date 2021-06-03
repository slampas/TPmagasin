package com.magasin.config;

import org.springframework.context.annotation.Bean;

import com.magasin.model.Categorie;
import com.magasin.model.Client;
import com.magasin.model.Commande;
import com.magasin.model.Produit;
import com.magasin.service.GenericService;
import com.magasin.service.impl.CategorieServiceImpl;
import com.magasin.service.impl.ClientServiceImpl;
import com.magasin.service.impl.CommandeServiceImpl;
import com.magasin.service.impl.ProduitServiceImpl;



public class ServiceConfig {
	
	
	
	
	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GenericService<Categorie> CategorieServiceFactory() {
		return new CategorieServiceImpl();
		
	}
	
	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GenericService<Client> ClientServiceFactory() {
		return new ClientServiceImpl();
		
	}
	
	
	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GenericService<Commande> CommandeServiceFactory() {
		return new CommandeServiceImpl();
		
	}
	
	

	
	/**
	 * avec un service generique 
	 * @return
	 */
	@Bean
	public GenericService<Produit> ProduitServiceFactory() {
		return new ProduitServiceImpl();
		
	}
	
	
	
	
	

}
