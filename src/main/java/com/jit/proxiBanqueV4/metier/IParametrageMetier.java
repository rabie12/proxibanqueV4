package com.jit.proxiBanqueV4.metier;

import com.jit.proxiBanqueV4.entites.Parametrage;

public interface IParametrageMetier {
	public boolean controlerStatistique(Parametrage parametrage);
	public Parametrage getParametrage(Long idParametrage);
	public Parametrage seConnecter(String login,String password);

}
