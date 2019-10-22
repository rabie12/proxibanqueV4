package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
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
