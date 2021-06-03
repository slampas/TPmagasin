package com.magasin.model;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	

	@ManyToMany
	@JoinTable(
			name = "commande_has_produit",
			joinColumns = @JoinColumn(name ="commande_id"),
			inverseJoinColumns = @JoinColumn(name = "produit_id")
			)
	private Collection<Produit> produits ;
	
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client")
	private Client client;
	
	

}
