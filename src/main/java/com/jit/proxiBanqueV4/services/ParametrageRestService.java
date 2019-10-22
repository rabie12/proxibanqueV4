package com.jit.proxiBanqueV4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Parametrage;
import com.jit.proxiBanqueV4.metier.IParametrageMetier;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe ParametrageRestService WS
 */
@RestController
public class ParametrageRestService {
	@Autowired
	private IParametrageMetier parametrageMetier;
	/**
	 * Méthode Rest qui permet l'authentification du profil parametrage
	 * @param login
	 * @param password
	 * @return
	 */
	@RequestMapping(value = "/proxiBanque/connecterParametrage/{login}/{password}",method = RequestMethod.GET)
	public Integer seConnecter( @PathVariable String login,@PathVariable String password) {
		return parametrageMetier.seConnecter(login, password);
	}
	/**
	 * Méthode Rest qui permet de récupérer un paramètrage
	 * @param idParametrage
	 * @return parametrage
	 */
	@RequestMapping(value = "/proxiBanque/parametrage/{idParametrage}",method = RequestMethod.GET)
	public Parametrage getParametrage(@PathVariable Long idParametrage) {
		return parametrageMetier.getParametrage(idParametrage);
	}
	/**
	 * Méthode Rest qui permet la modification des statistiques
	 * @param parametrage
	 * @return
	 */
	@RequestMapping(value = "/proxiBanque/parametrage",method = RequestMethod.PUT)
	public boolean controlerStatistique(@RequestBody Parametrage parametrage) {
		return parametrageMetier.controlerStatistique(parametrage);
	}

}
