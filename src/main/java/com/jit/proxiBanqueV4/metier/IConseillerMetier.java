package com.jit.proxiBanqueV4.metier;

import java.util.List;


import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Interface IConseillerMetier
 */
public interface IConseillerMetier {
	/**
	 * Méthode qui permet d'ajouter un conseiller 
	 * @param conseiller
	 * @return conseiller
	 */
	public Conseiller saveConseiller(Conseiller conseiller);
	/**
	 * Méthode qui permet de lister les conseillers
	 * @return listeConseiller
	 */
	public List<Conseiller> listeConseillers();
	/**
	 * Méthode qui permet 
	 * @param idConseiller
	 * @return conseiller
	 */
	public Conseiller getConseiller(int idConseiller);
	/**
	 * Méthode qui permet de modifier un conseiller
	 * @param conseiller
	 * @return boolean
	 */
	public boolean updateConseiller(Conseiller conseiller);
	/**
	 * Méthode qui permet de supprimer un conseiller
	 * @param idConseiller
	 * @return boolean
	 */
	public boolean deleteConseiller(int idConseiller);
	/**
	 * Méthode qui permet l'authentification d'un conseiller
	 * @param emailConseiller
	 * @param password
	 * @return int
	 */
	public int seConnecter(String emailConseiller,String password);
	
	
	/**
	 * Méthode qui permet d'ajouter un client
	 * @param client
	 * @return client
	 */
	public Client createClient(Client client);
	/**
	 * Méthode qui permet de récupérer un client par idClient
	 * @param idClient
	 * @return
	 */
	public Client getClient(Long idClient);
	/**
	 * Méthode qui permet de modifier un client
	 * @param client
	 * @return boolean
	 */
	public boolean updateClient(Client client);
	/**
	 * Méthode qui permet de lister les clients d'un Conseiller par idConseiller
	 * @param idConseiller
	 * @return listeClient
	 */
	public List<Client> listeClients(int idConseiller);
	/**
	 * Méthode qui permet d'alerter un conseiller concernant les clients à découvert
	 * @param idConseiller
	 * @return listeClient
	 */
	public List<Client> alertDecouvert(int idConseiller);
	
	

}
