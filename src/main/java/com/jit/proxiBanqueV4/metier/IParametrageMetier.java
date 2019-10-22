package com.jit.proxiBanqueV4.metier;

import com.jit.proxiBanqueV4.entites.Parametrage;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Interface IParametrageMetier
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
public interface IParametrageMetier {
	/**
	 * Méthode qui permet de modifier les statistique
	 * @param parametrage
	 * @return boolean
	 */
	public boolean controlerStatistique(Parametrage parametrage);
	/**
	 * méthode qui permet de récupérer un Paramètre
	 * @param idParametrage
	 * @return
	 */
	public Parametrage getParametrage(Long idParametrage);
<<<<<<< HEAD
	/**
	 * Méthode qui permet l'authentification au profil paramètrage
	 * @param login
	 * @param password
	 * @return parametrage
	 */
	public Parametrage seConnecter(String login,String password);
=======
	public int seConnecter(String login,String password);
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git

}
