package com.jit.proxiBanqueV4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Compte;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.metier.IClientMetier;
import com.jit.proxiBanqueV4.metier.ICompteMetier;
import com.jit.proxiBanqueV4.metier.IConseillerMetier;
/**
 * Classe ConseillerRestService WS
 */
@RestController
public class ConseillerRestService {
	@Autowired
	private IConseillerMetier conseillerMetier;
	@Autowired
	private ICompteMetier CompteMetier;
	@Autowired
	private IClientMetier clientMetier;
	/**
	 * Méthode Rest qui permet de lister les comptes
	 * @return listeComptes
	 */
	@RequestMapping(value = "/proxiBanque/listeComptes",method = RequestMethod.GET)
	public List<Compte> listeComptes() {
		return CompteMetier.listeComptes();
	}
	/**
	 * Méthode Rest qui permet l'authentification d'un conseilleir
	 * @param emailConseiller
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/proxiBanque/connecterConseiller/{emailConseiller}/{password}",method = RequestMethod.GET)
	public int seConnecter(@PathVariable String emailConseiller,@PathVariable String password) {
		return conseillerMetier.seConnecter(emailConseiller, password);
	}
	/**
	 * Méthode Rest qui permet d'alerter un conseiller des clients ayant un solde inférieur à zero
	 * @param idConseiller
	 * @return listeClient
	 */
	@RequestMapping(value = "/proxiBanque/alertDecouvert/{idConseiller}",method = RequestMethod.GET)
	public List<Client> alertDecouvert(@PathVariable int idConseiller) {
		return conseillerMetier.alertDecouvert(idConseiller);
	}

	/**
	 * Méthode Rest qui permet de lister les clients par idConseiller
	 * @param idConseiller
	 * @return listClient
	 */
	@RequestMapping(value = "/proxiBanque/listeClients/{idConseiller}",method = RequestMethod.GET)
	public List<Client> listeClients(@PathVariable int idConseiller) {
		return conseillerMetier.listeClients(idConseiller);
	}
	/**
	 * Méthode Rest qui permet de récupérer un client par idClient
	 * @param idClient
	 * @return client
	 */
	@RequestMapping(value = "/proxiBanque/getClient/{idClient}",method = RequestMethod.GET)
	public Client getClient(@PathVariable Long idClient) {
		return clientMetier.getClient(idClient);
	}
	/**
	 * Méthode Rest qui permet la modification d'un client
	 * @param client
	 * @return client
	 */
	@RequestMapping(value = "/proxiBanque/updateClient",method = RequestMethod.PUT)
	public boolean updateClient(@RequestBody Client client) {
		return clientMetier.updateClient(client);
	}
	/**
	 * Méthode Rest qui permet l'ajout d'un client
	 * @param client
	 * @return client
	 */
	@RequestMapping(value = "/proxiBanque/addClient",method = RequestMethod.POST)
	public Client createClient(@RequestBody Client client) {
		return conseillerMetier.createClient(client);
	}
	/**
	 * Méthode Rest qui permet d'ajouter un conseiller
	 * @param conseiller
	 * @return conseiller
	 */
	@RequestMapping(value = "/proxiBanque/conseillers",method = RequestMethod.POST)
	public Conseiller saveConseiller(@RequestBody Conseiller conseiller) {
		return conseillerMetier.saveConseiller(conseiller);
	}
	/**
	 * Méthode Rest qui permet de lister les conseillers
	 * @return listConseiller
	 */
	@RequestMapping(value = "/proxiBanque/conseillers",method = RequestMethod.GET)
	public List<Conseiller> listeConseillers() {
		return conseillerMetier.listeConseillers();
	}

}
