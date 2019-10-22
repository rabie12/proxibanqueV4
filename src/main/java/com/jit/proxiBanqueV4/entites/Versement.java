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
 * Classe Versement qui hérite de la classe abstraite Versement
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Entity
@DiscriminatorValue("versement")
public class Versement extends Operation implements Serializable {
	/**
	 * Constructeur avec paramètre
	 * @param dateOperation
	 * @param montant
	 */
	public Versement(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	/**
	 * Constructeur sans paramètre
	 */
	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
