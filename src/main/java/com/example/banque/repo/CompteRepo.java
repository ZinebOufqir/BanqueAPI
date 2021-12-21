package com.example.banque.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.banque.model.Compte;

@RepositoryRestResource
public interface CompteRepo extends JpaRepository<Compte, Long>{

}
