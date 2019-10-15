package ma.jit.proxibankv4.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Visa")
public class CarteVisa extends Carte{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarteVisa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarteVisa(long numCarte, String typeCarte, boolean activation, Compte compte) {
		super(numCarte, typeCarte, activation, compte);
		// TODO Auto-generated constructor stub
	}

}
