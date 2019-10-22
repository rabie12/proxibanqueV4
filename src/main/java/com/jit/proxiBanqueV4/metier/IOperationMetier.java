package com.jit.proxiBanqueV4.metier;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Interface IOperationMetier 
 */
public interface IOperationMetier {
	/**
	 * Méthode qui permet de verser dans un compte
	 * @param idCompte
	 * @param montant
	 * @param idConseiller
	 * @return boolean
	 */
	public boolean verser(String idCompte,double montant,int idConseiller);
	/**
	 * Méthode qui permet de retirer d'un compte
	 * @param idCompte
	 * @param montant
	 * @param idConseiller
	 * @return boolean
	 */
	public boolean retirer(String idCompte,double montant,int idConseiller);
	/**
	 * Méthode qui permet le virement compte à compte
	 * @param idCompte1
	 * @param idCompte2
	 * @param montant
	 * @param idConseiller
	 * @return boolean
	 */
	public boolean virement(String idCompte1,String idCompte2,double montant,int idConseiller);

}
