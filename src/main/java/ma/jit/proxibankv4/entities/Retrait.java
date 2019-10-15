package ma.jit.proxibankv4.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("Retrait")
public class Retrait extends Operation {

	public Retrait(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Retrait(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}

	public Retrait(long numOperation, Date dateOperation, double montant, Compte compte) {
		super(numOperation, dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

}
