package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
<<<<<<< HEAD
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Client implements Serializable {
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git

/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe Client
 */

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Client implements Serializable {
	/**
	 * Parametre : (Long idClient,String
	 * nomClient,prenomClient,emailClient,adresseClient,Collection<Compte>
	 * comptes,private Conseiller conseiller )
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	private String adresseClient;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private Collection<Compte> comptes;
	@ManyToOne
	@JoinColumn(name = "idConseiller")
	private Conseiller conseiller;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * getter idClient
	 * @return idClient
	 */
	public Long getIdClient() {
		return idClient;
	}
	/**
	 * setter idClient
	 * @param idClient
	 */
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	/**
	 * getter nomClient
	 * @return nomClient
	 */
	public String getNomClient() {
		return nomClient;
	}
	/**
	 * setter nomClient
	 * @param nomClient
	 */
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	/**
	 * getter prenomClient
	 * @return prenom
	 */
	public String getPrenomClient() {
		return prenomClient;
	}
	/**
	 * setter prenomClient
	 * @param prenomClient
	 */
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	/**
	 * getter emailClient
	 * @return emailClient
	 */
	public String getEmailClient() {
		return emailClient;
	}
	/**
	 * setter emailClient
	 * @param emailClient
	 */
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	/**
	 * getter adresseClient
	 * @return adresseClient
	 */
	public String getAdresseClient() {
		return adresseClient;
	}
	/**
	 * setter adresseClient
	 * @param adresseClient
	 */
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	/**
	 * getter Compte
	 * 
	 * @return compte
	 */
	@JsonIgnore
	public Collection<Compte> getComptes() {
		return comptes;
	}

	/**
	 * setter compte
	 * 
	 * @param comptes
	 */
	@JsonSetter
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * Constructeur avec paramètre
	 * 
	 * @param nomClient
	 * @param prenomClient
	 * @param emailClient
	 * @param adresseClient
	 */
	public Client(String nomClient, String prenomClient, String emailClient, String adresseClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
	}

	/**
	 * Constructeur sans paramètre
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
}
