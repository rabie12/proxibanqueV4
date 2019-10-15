package ma.jit.proxibankv4.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte{
	

	public CompteEpargne(Date dateCreation, double solde, Client client) {
		super( dateCreation, solde, client);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double tauxRenumeration;

	public double getTauxRenumeration() {
		return tauxRenumeration;
	}

	public void setTauxRenumeration(double tauxRenumeration) {
		this.tauxRenumeration = tauxRenumeration;
	}


	
}
