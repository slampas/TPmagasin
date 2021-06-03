package com.magasin.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.model.Categorie;


public interface CategorieRepositorie extends JpaRepository<Categorie, Long> {

}
