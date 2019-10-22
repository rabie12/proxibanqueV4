
package com.jit.proxiBanqueV4.entites;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
import java.io.Serializable;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe CompteCourant qui hérite de la classe abstraite Compte
 */
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private double decouvert;
	/**
	 * Constructeur avec paramètres :
	 * @param dateCreation
	 * @param solde
	 * @param decouvert
	 */
	public CompteCourant(Date dateCreation, double solde, double decouvert) {
		super(dateCreation, solde);
		this.decouvert = decouvert;
	}
	/**
	 * Constructeur sans paramètre
	 */
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 *  getter decouvert
	 * @return
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
