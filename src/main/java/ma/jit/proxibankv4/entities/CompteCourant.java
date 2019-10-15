package ma.jit.proxibankv4.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;

	




	public double getDecouvert() {
		return decouvert;
	}



	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}



	public CompteCourant(Date dateCreation, double solde, Client client) {
		super(dateCreation, solde, client);
		// TODO Auto-generated constructor stub
	}



	public CompteCourant() {
		super();
	}





}
