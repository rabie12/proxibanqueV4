package com.jit.proxiBanqueV4.metier;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IOperationMetier {
	public boolean verser(String idCompte,double montant,int idConseiller);
	public boolean retirer(String idCompte,double montant,int idConseiller);
	public boolean virement(String idCompte1,String idCompte2,double montant,int idConseiller);

}
