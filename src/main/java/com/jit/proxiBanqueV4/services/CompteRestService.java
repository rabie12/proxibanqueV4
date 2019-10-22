package com.jit.proxiBanqueV4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Compte;
import com.jit.proxiBanqueV4.metier.ICompteMetier;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe CompteRestService WS
 */
@RestController
public class CompteRestService {
	
	@Autowired
	private ICompteMetier compteMetier;
	/**
	 *  Méthode REST qui permet d'ajouter un compte
	 * @param compte
	 * @return compte
	 */
	@RequestMapping(value = "/comptes",method = RequestMethod.POST)
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteMetier.saveCompte(compte);
	}
	/**
	 * Méthode REST qui permet de récupérer un compte par idCompte
	 * @param idCompte
	 * @return compte
	 */
	@RequestMapping(value = "/comptes/{idCompte}",method = RequestMethod.GET)
	public Compte getCompteById(@PathVariable String idCompte) {
		return compteMetier.getCompteById(idCompte);
	}

}
