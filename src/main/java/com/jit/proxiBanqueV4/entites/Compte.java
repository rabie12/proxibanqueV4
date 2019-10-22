package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,include = JsonTypeInfo.As.PROPERTY,property = "type")
@JsonSubTypes({
               @Type(name = "CC",value =CompteCourant.class),
               @Type(name = "CE",value =CompteEpargne.class)
               })
public abstract class Compte implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * Parametre (int idCompt,double solde..) 
	 */
	@Id
	private String idCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "idConseiller")
	private Conseiller conseiller;
	@OneToMany(mappedBy = "compte",fetch = FetchType.LAZY)
	private Collection<Operation> operations;
	/**
	 * Constructeur avec 2 paramètres
	 * @param dateCreation
	 * @param solde
	 */
	public Compte(Date dateCreation, double solde) {
		super();
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	/**
	 * Constructeur sans paramètre
	 */
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * getter idCompte
	 * @return idCompte
	 */
	public String getIdCompte() {
		return idCompte;
	}
	/**
	 * setter idCompte
	 * @param idCompte
	 */
	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}
	/**
	 * getter dateCreation
	 * @return dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/**
	 * setter dateCreation
	 * @param dateCreation
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	/**
	 * getter solde
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}
	/**
	 * setter solde
	 * @param solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/**
	 * getter client
	 * @return client
	 */
	public Client getClient() {
		return client;
	}
	/**
	 * setter client
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	/**
	 * getter operation
	 * @return operation
	 */
	@JsonIgnore
	public Collection<Operation> getOperations() {
		return operations;
	}
	/**
	 * setter operations
	 * @param operations
	 */
	@JsonSetter
	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * getter conseiller
	 * @return conseiller
	 */
	public Conseiller getConseiller() {
		return conseiller;
	}
	/**
	 * setter conseiller
	 * @param conseiller
	 */
	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	

}
