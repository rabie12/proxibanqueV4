package com.jit.proxiBanqueV4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.metier.IConseillerMetier;

@RestController
public class ConseillerRestService {
	@Autowired
	private IConseillerMetier conseillerMetier;
	@RequestMapping(value = "/conseillers",method = RequestMethod.POST)
	public Conseiller saveConseiller(@RequestBody Conseiller conseiller) {
		return conseillerMetier.saveConseiller(conseiller);
	}
	@RequestMapping(value = "/conseillers",method = RequestMethod.GET)
	public List<Conseiller> listeConseillers() {
		return conseillerMetier.listeConseillers();
	}

}
