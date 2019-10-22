
package com.jit.proxiBanqueV4.metier;

import java.util.List;

import com.jit.proxiBanqueV4.entites.Client;

/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */

/**
 * Interface IClientMetier
 */
public interface IClientMetier {
	/**
	 * méthode qui permet d'ajouter un client
	 * @param client
	 * @return client
	 */
	public Client saveClient(Client client);
	/**
	 * Méthode qui permet de lister des clients
	 * @return listeClients
	 */
	public List<Client> listeClients();
	/**
	 * Méthode qui permet de récupérer un client par id
	 * @param idClient
	 * @return client
	 */
	public Client getClient(Long idClient);
	/**
	 * méthode qui permet de supprimer un client
	 * @param idClient
	 * @return boolean
	 */
	public boolean deleteClient(Long idClient);
	/**
	 * Méthode qui permet modifier un client
	 * @param client
	 * @return boolean
	 */
	public boolean updateClient(Client client);

}
