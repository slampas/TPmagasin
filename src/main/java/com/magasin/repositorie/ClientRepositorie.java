package com.magasin.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magasin.model.Client;


public interface ClientRepositorie extends JpaRepository<Client, Long> {

}
