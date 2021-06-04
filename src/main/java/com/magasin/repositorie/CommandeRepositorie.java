package com.magasin.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.model.Commande;

public interface CommandeRepositorie extends JpaRepository<Commande, Long> {


	public Iterable<Commande> findByClientId(Long id);
}
