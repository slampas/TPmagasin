package com.magasin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name = "nom")
	private String nom;
	
	
	@Column(name = "prix")
	private String prix;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie")
	private Categorie categorie;

	
	
	
	
}
