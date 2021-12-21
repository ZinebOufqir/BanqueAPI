package com.example.banque.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="type", types = Compte.class)
public interface CompteProjection2 {
        public double getSolde();
        public  TypeCompte getType();
        
}
