package com.example.banque.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banque.model.Compte;
import com.example.banque.repo.CompteRepo;


//@RestController
@RequestMapping("/banque")
public class CompteRESTControllerAPI {
	
	@Autowired
	 private CompteRepo compteRepo;
	
	@GetMapping(path="/comptes" , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public List<Compte> compteList(){
		return compteRepo.findAll();
    }
	
	@GetMapping(path="/comptes/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE} )
	public Compte compte(@PathVariable(value ="id") Long id){
		return compteRepo.findById(id).get();
    }
    
	@PostMapping(path="/comptes")
	public Compte add(@RequestBody Compte compte){
		return compteRepo.save(compte);
    }
	
	@PutMapping("/comptes/{id}")
	public Compte update(@RequestBody Compte compte,@PathVariable(value ="id") Long id){

		return compteRepo.save(compte);
    }
	
	@DeleteMapping("/comptes/{id}")
	public void delete(@PathVariable(value="id") Long id){
		 compteRepo.deleteById(id);
    }
}
