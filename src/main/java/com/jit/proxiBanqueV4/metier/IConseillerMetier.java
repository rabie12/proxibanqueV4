package com.jit.proxiBanqueV4.metier;

import java.util.List;

import com.jit.proxiBanqueV4.entites.Conseiller;

public interface IConseillerMetier {
	public Conseiller saveConseiller(Conseiller conseiller);
	public List<Conseiller> listeConseillers();

}
