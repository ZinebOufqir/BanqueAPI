package com.example.banque.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.banque.model.Compte;
import com.example.banque.repo.CompteRepo;


@Component
@Path("/banque")
public class CompteRESTJaxRSAPI {
	
	@Autowired
	 private CompteRepo compteRepo;
	
	@Path("/comptes")
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Compte> compteList(){
		return compteRepo.findAll();
    }
	
	@Path("/comptes/{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Compte compte(@PathParam(value ="id") Long id){
		return compteRepo.findById(id).get();
    }
    
	@Path("/comptes")
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public Compte add(Compte  compte){
		return compteRepo.save(compte);
    }
	
	@Path("/comptes/{id}")
	@PUT
	@Produces({MediaType.APPLICATION_JSON})
	public Compte update(Compte compte,@PathParam(value ="id") Long id){
		//compte.setDate(null);
		return compteRepo.save(compte);
    }
	
	@Path("/comptes/{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON})
	public void delete(@PathParam(value="id") Long id){
		 compteRepo.deleteById(id);
    }
}
