package com.jit.proxiBanqueV4.metier;

import java.util.List;

import com.jit.proxiBanqueV4.entites.Gerant;


public interface IGerantMetier {
	public Gerant saveGerant(Gerant gerant);
	public List<Gerant> listeGerants();
}
