package com.example.banque;



import java.util.Date;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.banque.model.Client;
import com.example.banque.model.Compte;
import com.example.banque.model.TypeCompte;
import com.example.banque.repo.ClientRepo;
import com.example.banque.repo.CompteRepo;





@SpringBootApplication
public class Application  {

	public static void main(String[] args) {                   
		SpringApplication.run(Application.class, args);
	}
	
	@Bean 
	CommandLineRunner start(CompteRepo compteRepo, ClientRepo clientRepo) {
		return args -> {
			//repositoryRestResource.exposeIdsFor(Compte.class);
		    Client c1 =clientRepo.save(new Client(null,"Noura",null));
			compteRepo.save(new Compte(Math.random()*9000, new Date(), TypeCompte.EPARGNE ,c1));
			//compteRepo.save(new Compte(Math.random()*9000, new Date(), TypeCompte.COURANT));
			//compteRepo.save(new Compte(Math.random()*9000, new Date(), TypeCompte.EPARGNE));
			  compteRepo.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
  
}
