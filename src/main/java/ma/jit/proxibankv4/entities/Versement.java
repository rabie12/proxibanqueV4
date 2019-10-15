package ma.jit.proxibankv4.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Versement")
public class Versement extends Operation{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Versement(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Versement(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}



	
	

}
