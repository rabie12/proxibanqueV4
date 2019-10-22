package com.jit.proxiBanqueV4.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */

/**
 * Classe Parametrage
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Parametrage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParametrage;
	private String login;
	private String password;
	private double decouvert=3000;
	private int commission=5;
	private int nbrClients=5;
	private int nbrConseillers=10;
	private double solde=20;
	private String styleGraphe;
	/**
	 * getter idParametrage
	 * @return idParametrage
	 */
	public Long getIdParametrage() {
		return idParametrage;
	}
	/**
	 * setter idParametrage
	 * @param idParametrage
	 */
	public void setIdParametrage(Long idParametrage) {
		this.idParametrage = idParametrage;
	}
	/**
	 * getter login
	 * @return login
	 */
	public String getLogin() {
		return login;
	}
	/**
	 * setter login
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	/**
	 * getter password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * setter password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * getter decouvert
	 * @return decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/**
	 * setter decouvert
	 * @param decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	/**
	 * getter commission
	 * @return
	 */
	public int getCommission() {
		return commission;
	}
	/**
	 * setter comission
	 * @param commission
	 */
	public void setCommission(int commission) {
		this.commission = commission;
	}
	/**
	 * getter nbrClient
	 * @return nbrClient
	 */
	public int getNbrClients() {
		return nbrClients;
	}
	/**
	 * setter nbrClients
	 * @param nbrClients
	 */
	public void setNbrClients(int nbrClients) {
		this.nbrClients = nbrClients;
	}
	/**
	 * getter nbrConseillers
	 * @return nbrConseillers
	 */
	public int getNbrConseillers() {
		return nbrConseillers;
	}
	/**
	 * setter nbrConseillers
	 * @param nbrConseillers
	 */
	public void setNbrConseillers(int nbrConseillers) {
		this.nbrConseillers = nbrConseillers;
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
	 * getter styleGraphe
	 * @return styleGraphe
	 */
	public String getStyleGraphe() {
		return styleGraphe;
	}
	/**
	 * setter styleGraphe
	 * @param styleGraphe
	 */
	public void setStyleGraphe(String styleGraphe) {
		this.styleGraphe = styleGraphe;
	}
	/**
	 * Constructeur sans paramètre
	 */
	public Parametrage() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avec paramètre
	 * @param login
	 * @param password
	 */
	public Parametrage(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	

}
