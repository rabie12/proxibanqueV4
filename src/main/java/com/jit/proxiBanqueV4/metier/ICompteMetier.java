package com.jit.proxiBanqueV4.metier;

import java.math.BigInteger;
import java.util.List;

import com.jit.proxiBanqueV4.entites.Compte;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Interface ICompteMetier
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
public interface ICompteMetier {
	/**
	 * méthode qui permet d'ajouter un compte
	 * @param compte
	 * @return compte
	 */
	public Compte saveCompte(Compte compte);
	/**
	 * Méthode qui permet de récupérer un compte par idCompte
	 * @param idCompte
	 * @return compte
	 */
	public Compte getCompteById(String idCompte);
	/**
	 * Méthode qui permet de lister les compte
	 * @return listeComptes
	 */
	public List<Compte> listeComptes();
	/**
	 * Méthode qui permet de supprimer un compte
	 * @param idCompte
	 * @return boolean
	 */
	public boolean deleteCompte(String idCompte);
	
	/**
	 * Méthode qui permet de gérer l'idCompte
	 * @return
	 */
	public BigInteger idCompte();

}
