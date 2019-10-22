package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe CompteEpargne qui hérite de la classe abstraite Compte
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte implements Serializable {

	private static final long serialVersionUID = 1L;

	private double taux;

	/**
	 * getter taux
	 * @return taux
	 */
	public double getTaux() {
		return taux;
	}
	/**
	 * setter taux
	 * @param taux
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * Constructeur sans paramètre
	 */
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avec paramètre
	 * @param dateCreation
	 * @param solde
	 * @param taux
	 */
	public CompteEpargne(Date dateCreation, double solde, double taux) {
		super(dateCreation, solde);
		this.taux = taux;
	}

}
