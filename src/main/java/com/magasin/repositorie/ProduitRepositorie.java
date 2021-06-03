package com.magasin.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.model.Produit;


public interface ProduitRepositorie extends JpaRepository<Produit, Long> {

}
