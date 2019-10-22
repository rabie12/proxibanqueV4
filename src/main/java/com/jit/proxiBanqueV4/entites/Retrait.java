package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */

/**
 * Classe Retrait qui hérite de la classe abstraite Opération
 */
@Entity
@DiscriminatorValue("retrait")
public class Retrait  extends Operation implements Serializable {
	/**
	 * Construteur sans paramètre
	 */
	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avec paramètre
	 * @param dateOperation
	 * @param montant
	 */
	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

}

