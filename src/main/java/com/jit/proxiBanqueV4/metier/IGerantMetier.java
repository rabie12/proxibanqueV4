package com.jit.proxiBanqueV4.metier;

import java.util.List;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.entites.Gerant;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Interface IGerantMetier
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
public interface IGerantMetier {
	/**
	 * Méthode qui permet de créer un gérant
	 * @param gerant
	 * @return gerant
	 */
	public Gerant saveGerant(Gerant gerant);
	/**
	 * Méthode qui permet de lister les gérants
	 * @return gerant
	 */
	public List<Gerant> listeGerants();
	/**
	 * Méthode d'authentification d'un gérant
	 * @param emailGerant
	 * @param password
	 * @return gerant
	 */
	public Integer seConnecter(String emailGerant,String password);
	
	
	/**
	 * Méthode qui permet d'ajouter un conseiller
	 * @param conseiller
	 * @return conseiller
	 */

	public Conseiller saveConseiller(Conseiller conseiller);
	/**
	 * Méthode qui permet de lister les conseillers
	 * @return listConseiller
	 */
	public List<Conseiller> listeConseillers();
	/**
	 * Méthode qui permet d'affecter un client non-affecté à un conseiller
	 * @param idClient
	 * @param idConseiller
	 * @return boolean
	 */
	public boolean affecterClient(Long idClient,int idConseiller);
	/**
	 * Méthode qui permet d'alerter le gérant par rapport au client à découvert
	 * @return listClient
	 */
	
	public List<Client> alertDecouvert(); 
}
