package ma.jit.proxibankv4.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeCarte", discriminatorType = DiscriminatorType.STRING, length = 10)
public abstract class Carte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private long numCarte;
	private boolean activation;
	@ManyToOne
	@JoinColumn(name = "numCompte")
	private Compte compte;

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public long getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(long numCarte) {
		this.numCarte = numCarte;
	}


	public boolean isActivation() {
		return activation;
	}

	public void setActivation(boolean activation) {
		this.activation = activation;
	}

	public Carte(long numCarte, String typeCarte, boolean activation, Compte compte) {
		super();
		this.numCarte = numCarte;
		this.activation = activation;
		this.compte = compte;
	}

	public Carte() {
		super();
	}

}
