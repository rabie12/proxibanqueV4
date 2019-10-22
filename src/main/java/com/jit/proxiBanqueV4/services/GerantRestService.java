package com.jit.proxiBanqueV4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.entites.Gerant;
import com.jit.proxiBanqueV4.metier.IGerantMetier;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe GerantRestService WS
 */
@RestController
public class GerantRestService {
	@Autowired
	private IGerantMetier gerantMetier;
	/**
	 * Méthode Rest qui permet l'authentification d'un gérant
	 * @param emailGerant
	 * @param password
	 * @return gerant
	 */
	@RequestMapping(value = "/proxiBanque/connecterGerant/{emailGerant}/{password}",method = RequestMethod.GET)
	public Integer seConnecter(@PathVariable String emailGerant,@PathVariable String password) {
		return gerantMetier.seConnecter(emailGerant, password);
	}
	/**
	 * Méthode Rest qui permet d'ajouter un Conseiller 
	 * @param conseiller
	 * @return conseiller
	 */
	@RequestMapping(value = "/proxiBanque/addConseiller",method = RequestMethod.POST)
	public Conseiller saveConseiller(@RequestBody Conseiller conseiller) {
		return gerantMetier.saveConseiller(conseiller);
	}
	/**
	 * Méthode REST qui permet d'affecter un client à un conseiller par un gérant
	 * @param idClient
	 * @param idConseiller
	 * @return booleaon
	 */
	@RequestMapping(value = "/proxiBanque/affecterClient",method = RequestMethod.PUT)
	public boolean affecterClient(@RequestParam Long idClient,@RequestParam int idConseiller) {
		return gerantMetier.affecterClient(idClient,idConseiller);
	}
	/**
	 * Méthode REST qui permet de lister  les conseillers
	 * @return listConseiller
	 */
	@RequestMapping(value = "/proxiBanque/listeConseillers",method = RequestMethod.GET)
	public List<Conseiller> listeConseillers() {
		return gerantMetier.listeConseillers();
	}
	/**
	 * Méthode Rest qui permet d'ajouter un gérant
	 * @param gerant
	 * @return gerant
	 */
	@RequestMapping(value = "/proxiBanque/gerants",method = RequestMethod.POST)
	public Gerant saveGerant(@RequestBody Gerant gerant) {
		return gerantMetier.saveGerant(gerant);
	}
	/**
	 * Méthode Rest qui permet de lister les gérants
	 * @return listGerant
	 */
	@RequestMapping(value = "/proxiBanque/gerants",method = RequestMethod.GET)
	public List<Gerant> listeGerants() {
		return gerantMetier.listeGerants();
	}
	/**
	 * Méthode Rest qui permet d'alerter le gérant par rapport aux clients ayant un solde inférieur à zero 
	 * @return listClient
	 */
	@RequestMapping(value = "/proxiBanque/alertDecouvert",method = RequestMethod.GET)
	public List<Client> alertDecouvert() {
		return gerantMetier.alertDecouvert();
	}

}
