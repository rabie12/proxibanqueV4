package com.jit.proxiBanqueV4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jit.proxiBanqueV4.entites.Gerant;
import com.jit.proxiBanqueV4.metier.IGerantMetier;

@RestController
public class GerantRestService {
	@Autowired
	private IGerantMetier gerantMetier;
	@RequestMapping(value = "/gerants",method = RequestMethod.POST)
	public Gerant saveGerant(@RequestBody Gerant gerant) {
		return gerantMetier.saveGerant(gerant);
	}

	@RequestMapping(value = "/gerants",method = RequestMethod.GET)
	public List<Gerant> listeGerants() {
		return gerantMetier.listeGerants();
	}

}
