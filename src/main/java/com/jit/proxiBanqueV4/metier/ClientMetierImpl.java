/**
 * package Metier
 */
package com.jit.proxiBanqueV4.metier;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IClientDao;
import com.jit.proxiBanqueV4.dao.ICompteDao;
import com.jit.proxiBanqueV4.entites.Client;
/**
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe ClientMetier qui imlplémente l'interface IClientMetier
 */
/**
 * Class metier
 */
@Service
public class ClientMetierImpl implements IClientMetier {
	@Autowired
	private IClientDao clientDao;
	@Autowired
	private ICompteDao compteDao;
	/**
	 * Méthode qui permet d'ajouter un client
	 */
	@Override
	public Client saveClient(Client client) {
		return clientDao.save(client);
	}
	/**
	 * Méthode qui permet de lister les clients
	 */
	@Override
	public List<Client> listeClients() {
		return clientDao.findAll();
	}
	/**
	 * Méthode qui permet de rechercher un client par idClient
	 */
	@Override
	public Client getClient(Long idClient) {
		return clientDao.getOne(idClient) ;
	}

	/**
	 * méthode qui permet de supprimer un client à partir d'un client recu en paramètre
	 */

  /**
   * Fonction de supression d'un client
   */

	@Override
	public boolean deleteClient(Long idClient) {
		Client client=getClient(idClient);
		clientDao.delete(client);
		compteDao.deleteCompteByIdClient(idClient);
		return true;
	}
	/**
	 * méthode qui permet de modifier un Client
	 */
	@Override
	public boolean updateClient(Client client) {
		Client clientOld=getClient(client.getIdClient());
		clientOld.setNomClient(client.getNomClient());
		clientOld.setPrenomClient(client.getPrenomClient());
		clientOld.setEmailClient(client.getEmailClient());
		clientOld.setAdresseClient(client.getAdresseClient());
		clientDao.save(clientOld);
		return true;
	}

}
