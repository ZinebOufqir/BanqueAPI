package com.example.banque.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Client {
	public Client() {
	
	}

	public Client(Long id, String name , Collection<Compte> comptes ) {
		super();
		this.id = id;
		this.name = name;
		//this.comptes = comptes;
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String name;
    @OneToMany(mappedBy="client")
    private Collection<Compte> comptes;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
    
	
	
}
