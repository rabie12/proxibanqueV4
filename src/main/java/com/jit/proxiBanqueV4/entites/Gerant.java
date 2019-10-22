package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
/**
 * Classe Gerant
 */
@Entity
public class Gerant  implements Serializable {

	/**
	 * Parametre (Long idGerant,String nomGerant,String prenomGerant,String
	 * emailGerant,String adresseGerant,Collection<Conseiller> conseillers)
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGerant;
	private String nomGerant;
	private String prenomGerant;
	private String emailGerant;
	private String password;
	private String adresseGerant;
	@OneToMany(mappedBy = "gerant", fetch = FetchType.LAZY)
	private Collection<Conseiller> conseillers;
	/**
	 * Constructeur sans paramètre
	 */
	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avec paramètre
	 * @param nomGerant
	 * @param prenomGerant
	 * @param emailGerant
	 * @param password
	 * @param adresseGerant
	 */
	public Gerant(String nomGerant, String prenomGerant, String emailGerant, String password, String adresseGerant) {
		super();
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.emailGerant = emailGerant;
		this.password = password;
		this.adresseGerant = adresseGerant;
	}
	/**
	 *  getter idGerant
	 * @return idGerant
	 */
	public Long getIdGerant() {
		return idGerant;
	}
	/**
	 * setter idGerant
	 * @param idGerant
	 */
	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}
	/**
	 * getter nomGerant
	 * @return nomGerant
	 */
	public String getNomGerant() {
		return nomGerant;
	}
	/**
	 * setter nomGerant
	 * @param nomGerant
	 */
	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}
	/**
	 * getter prenomGerant
	 * @return prenomGerant
	 */
	public String getPrenomGerant() {
		return prenomGerant;
	}
	/**
	 * setter prenomGerant
	 * @param prenomGerant
	 */
	public void setPrenomGerant(String prenomGerant) {
		this.prenomGerant = prenomGerant;
	}
	/**
	 *  getter emailGerant
	 * @return emailGerant
	 */
	public String getEmailGerant() {
		return emailGerant;
	}
	/**
	 * setter emailGerant
	 * @param emailGerant
	 */
	public void setEmailGerant(String emailGerant) {
		this.emailGerant = emailGerant;
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
	 * getter adresseGerant
	 * @return
	 */
	public String getAdresseGerant() {
		return adresseGerant;
	}
	/**
	 * setter adresseGerant
	 * @param adresseGerant
	 */
	public void setAdresseGerant(String adresseGerant) {
		this.adresseGerant = adresseGerant;
	}
	/**
	 *  getter conseillers
	 * @return conseillers
	 */
	public Collection<Conseiller> getConseillers() {
		return conseillers;
	}
	/**
	 * setter conseillers
	 * @param conseillers
	 */
	public void setConseillers(Collection<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
