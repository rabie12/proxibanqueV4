package com.jit.proxiBanqueV4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.metier.IClientMetier;
import com.jit.proxiBanqueV4.metier.IConseillerMetier;

@RestController
public class ConseillerRestService {
	@Autowired
	private IConseillerMetier conseillerMetier;
	
	@RequestMapping(value = "/alertDecouvert/{idConseiller}",method = RequestMethod.GET)
	public List<Client> alertDecouvert(@PathVariable Long idConseiller) {
		return conseillerMetier.alertDecouvert(idConseiller);
	}
	@Autowired
	private IClientMetier clientMetier;
	
	@RequestMapping(value = "/listeClients/{idConseiller}",method = RequestMethod.GET)
	public List<Client> listeClients(@PathVariable Long idConseiller) {
		return conseillerMetier.listeClients(idConseiller);
	}
	
	@RequestMapping(value = "/getClient/{idClient}",method = RequestMethod.GET)
	public Client getClient(@PathVariable Long idClient) {
		return clientMetier.getClient(idClient);
	}
	
	@RequestMapping(value = "/updateClient",method = RequestMethod.PUT)
	public boolean updateClient(@RequestBody Client client) {
		return clientMetier.updateClient(client);
	}
	@RequestMapping(value = "/addClient",method = RequestMethod.POST)
	public Client createClient(@RequestBody Client client,@RequestBody double solde) {
		return conseillerMetier.createClient(client, solde);
	}
	@RequestMapping(value = "/conseillers",method = RequestMethod.POST)
	public Conseiller saveConseiller(@RequestBody Conseiller conseiller) {
		return conseillerMetier.saveConseiller(conseiller);
	}
	@RequestMapping(value = "/conseillers",method = RequestMethod.GET)
	public List<Conseiller> listeConseillers() {
		return conseillerMetier.listeConseillers();
	}

}
