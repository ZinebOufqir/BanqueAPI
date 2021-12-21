package com.example.banque.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
@Entity
public class Compte  implements Serializable{
	public Compte() {
		//super();
	}
	
	
	public Compte(/*Long id,*/ double solde, Date date, TypeCompte type, Client client) {
		super();
		//this.id = id;
		this.solde = solde;
		this.date = date;
		this.type = type;
		this.client=client;
	}
	


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Nullable
	@Column(nullable = false, updatable= false)
	private Long id;
	private double solde;
    @Temporal(TemporalType.DATE)
	private Date date;
	@Enumerated(EnumType.ORDINAL)
	@Column(length = 10)
	private TypeCompte type;
	@ManyToOne
	private Client client;
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public TypeCompte getType() {
		return type;
	}


	public void setType(TypeCompte type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return "Compte( " +this.id +" , " +this.solde +" , " +this.date
				+" , " +this.type;
	}
}
