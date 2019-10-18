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

@RestController
public class GerantRestService {
	@Autowired
	private IGerantMetier gerantMetier;
	
	@RequestMapping(value = "/proxiBanque/connecterGerant/{emailGerant}/{password}",method = RequestMethod.GET)
	public Gerant seConnecter(@PathVariable String emailGerant,@PathVariable String password) {
		return gerantMetier.seConnecter(emailGerant, password);
	}

	@RequestMapping(value = "/proxiBanque/addConseiller",method = RequestMethod.POST)
	public Conseiller saveConseiller(@RequestBody Conseiller conseiller) {
		return gerantMetier.saveConseiller(conseiller);
	}

	@RequestMapping(value = "/proxiBanque/affecterClient",method = RequestMethod.PUT)
	public boolean affecterClient(@RequestParam Long idClient,@RequestParam Long idConseiller) {
		return gerantMetier.affecterClient(idClient,idConseiller);
	}
	@RequestMapping(value = "/proxiBanque/listeConseillers",method = RequestMethod.GET)
	public List<Conseiller> listeConseillers() {
		return gerantMetier.listeConseillers();
	}

	@RequestMapping(value = "/proxiBanque/gerants",method = RequestMethod.POST)
	public Gerant saveGerant(@RequestBody Gerant gerant) {
		return gerantMetier.saveGerant(gerant);
	}

	@RequestMapping(value = "/proxiBanque/gerants",method = RequestMethod.GET)
	public List<Gerant> listeGerants() {
		return gerantMetier.listeGerants();
	}
	@RequestMapping(value = "/proxiBanque/alertDecouvert",method = RequestMethod.GET)
	public List<Client> alertDecouvert() {
		return gerantMetier.alertDecouvert();
	}

}
