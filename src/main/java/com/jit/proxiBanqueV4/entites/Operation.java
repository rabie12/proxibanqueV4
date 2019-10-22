
package com.jit.proxiBanqueV4.entites;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe abstraite Operation 
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_operation")
public abstract class Operation implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOperation;
	private Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name = "idCompte")
	private Compte compte;
	@ManyToOne
	@JoinColumn(name = "idConseiller")
	private Conseiller conseiller;
	
	/**
	 * Constructeur sans parmètre
	 */
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur avec paramètre
	 * @param dateOperation
	 * @param montant
	 */
	public Operation(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	/**
	 * getter idOperation
	 * @return idOperation
	 */
	public Long getIdOperation() {
		return idOperation;
	}
	/**
	 * setter idOperation
	 * @param idOperation
	 */
	public void setIdOperation(Long idOperation) {
		this.idOperation = idOperation;
	}
	/**
	 * getter dateOperation
	 * @return dateOperation
	 */
	public Date getDateOperation() {
		return dateOperation;
	}
	/**
	 * setter dateOperation 
	 * @param dateOperation
	 */
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	/**
	 * getter montant
	 * @return montant
	 */
	public double getMontant() {
		return montant;
	}
	/**
	 * setter montant
	 * @param montant
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}
	/**
	 * getter compte
	 * @return compte
	 */
	public Compte getCompte() {
		return compte;
	}
	/**
	 * setter compte
	 * @param compte
	 */
	public void setCompte(Compte compte) {
		this.compte = compte;
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
