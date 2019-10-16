package com.jit.proxiBanqueV4.metier;

import com.jit.proxiBanqueV4.entites.Compte;

public interface ICompteMetier {
	public Compte saveCompte(Compte compte);
	public Compte getCompteById(String idCompte);

}
