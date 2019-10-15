package ma.jit.proxibankv4.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("conseiller")
public class Conseiller extends Employe{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Conseiller(String nom, String prenom, String email, String mdp, String adresse) {
		super(nom, prenom, email, mdp, adresse);
		// TODO Auto-generated constructor stub
	}

}
