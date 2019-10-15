package ma.jit.proxibankv4.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Premuim")
public class CartePremuim extends Carte{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CartePremuim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartePremuim(long numCarte, String typeCarte, boolean activation, Compte compte) {
		super(numCarte, typeCarte, activation, compte);
		// TODO Auto-generated constructor stub
	}

}
