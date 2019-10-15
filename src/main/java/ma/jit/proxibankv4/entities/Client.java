package ma.jit.proxibankv4.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String email;
	@ManyToOne
	@JoinColumn(name = "idEmploye")
	private Employe employe;
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Compte> listeCompte;

	

	public Client() {
		super();
	}



	public Client(String nom, String prenom, String adresse, String email,  Employe employe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		
		this.employe = employe;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public Employe getEmploye() {
		return employe;
	}

	public void setConseiller(Employe employe) {
		this.employe = employe;
	}

}
