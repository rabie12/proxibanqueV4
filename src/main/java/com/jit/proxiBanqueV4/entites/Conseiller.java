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
import com.fasterxml.jackson.annotation.JsonSetter;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */

/**
 * Classe Conseiller
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Entity
public class Conseiller implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConseiller;
	private String nomConseiller;
	private String prenomConseiller;
	private String emailConseiller;
	private String password;
	private String adresseConseiller;
	@OneToMany(mappedBy = "conseiller",fetch = FetchType.LAZY)
	private Collection<Client> clients;
	@ManyToOne
	@JoinColumn(name = "idGerant")
	private Gerant gerant;
	/**
	 * Constructeur avec paramètre
	 */
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur sans paramètre
	 * @param nomConseiller
	 * @param prenomConseiller
	 * @param emailConseiller
	 * @param password
	 * @param adresseConseiller
	 */
	public Conseiller(String nomConseiller, String prenomConseiller, String emailConseiller, String password,
			String adresseConseiller) {
		super();
		this.nomConseiller = nomConseiller;
		this.prenomConseiller = prenomConseiller;
		this.emailConseiller = emailConseiller;
		this.password = password;
		this.adresseConseiller = adresseConseiller;
	}
	/**
	 * getter idClient
	 * @return idClient
	 */
	public int getIdConseiller() {
		return idConseiller;
	}
	/**
	 * setter idConseiller
	 * @param idConseiller
	 */
	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}
	/**
	 * getter nomConseiller
	 * @return nomConseiller
	 */
	public String getNomConseiller() {
		return nomConseiller;
	}
	/**
	 * setter nomConseiller
	 * @param nomConseiller
	 */
	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}
	/**
	 * getter prenomConseiller
	 * @return
	 */
	public String getPrenomConseiller() {
		return prenomConseiller;
	}
	/**
	 * setter prenomConseiller
	 * @param prenomConseiller
	 */
	public void setPrenomConseiller(String prenomConseiller) {
		this.prenomConseiller = prenomConseiller;
	}
	/**
	 * getter emailConseiller
	 * @return
	 */
	public String getEmailConseiller() {
		return emailConseiller;
	}
	/**
	 * setter emailConseiller
	 * @param emailConseiller
	 */
	public void setEmailConseiller(String emailConseiller) {
		this.emailConseiller = emailConseiller;
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
	 * getter adresseConseiller
	 * @return adresseConseiller
	 */
	public String getAdresseConseiller() {
		return adresseConseiller;
	}
	/**
	 * setter adresseConseiller
	 * @param adresseConseiller
	 */
	public void setAdresseConseiller(String adresseConseiller) {
		this.adresseConseiller = adresseConseiller;
	}
	/**
	 * getter clients
	 * @return clients
	 */
	@JsonIgnore
	public Collection<Client> getClients() {
		return clients;
	}
	/**
	 * setter clients
	 * @param clients
	 */
	@JsonSetter
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	/**
	 * getter gerant
	 * @return gerant
	 */
	@JsonIgnore
	public Gerant getGerant() {
		return gerant;
	}
	/**
	 * setter gerant
	 * @param gerant
	 */
	@JsonSetter
	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
