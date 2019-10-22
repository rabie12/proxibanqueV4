package com.jit.proxiBanqueV4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.metier.IClientMetier;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe ClientRestService WS
 */
@RestController
public class ClientRestService {
	@Autowired
	private IClientMetier clientMetier;
	/**
	 * Méthode Rest qui permet de modifier un client
	 * @param client
	 * @return boolean
	 */
	@RequestMapping(value = "/proxiBanque/clients",method = RequestMethod.PUT)
	public boolean updateClient(@RequestBody Client client) {
		return clientMetier.updateClient(client);
	}
	/**
	 * Méthode Rest qui permet la suppression d'un client
	 * @param idClient
	 * @return
	 */
	@RequestMapping(value = "/proxiBanque/clients/{idClient}",method = RequestMethod.DELETE)
	public boolean deleteClient(@PathVariable Long idClient) {
		return clientMetier.deleteClient(idClient);
	}
	/**
	 * Méthode Rest qui permet la récupération d'un client par idClient 
	 * @param idClient
	 * @return client
	 */
	@RequestMapping(value = "/proxiBanque/clients/{idClient}",method = RequestMethod.GET)
	public Client getClient(@PathVariable Long idClient) {
		return clientMetier.getClient(idClient);
	}
	/**
	 * Méthode Rest qui permet d'ajouter un client
	 * @param client
	 * @return client
	 */
	@RequestMapping(value = "/proxiBanque/clients",method = RequestMethod.POST)
	public Client saveClient(@RequestBody Client client) {
		return clientMetier.saveClient(client);
	}
	/**
	 * Méthode Rest qui permet de lister les clients
	 * @return listClient
	 */
	@RequestMapping(value = "/clients",method = RequestMethod.GET)
	public List<Client> listeClients() {
		return clientMetier.listeClients();
	}

}
