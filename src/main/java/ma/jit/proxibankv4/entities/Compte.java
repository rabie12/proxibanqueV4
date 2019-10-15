package ma.jit.proxibankv4.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeCompte", discriminatorType = DiscriminatorType.STRING, length = 2)
public abstract class Compte implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	@OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
	private List<Operation> operation;

	public Long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Operation> getOperation() {
		return operation;
	}

	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}

	public Compte( Date dateCreation, double solde, Client client) {
		super();
		
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
		
	}

	

	public Compte() {
		super();
	}
	

}
