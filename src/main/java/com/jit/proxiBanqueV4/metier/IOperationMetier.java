package com.jit.proxiBanqueV4.metier;

public interface IOperationMetier {
	public boolean verser(String idCompte,double montant,int idConseiller);
	public boolean retirer(String idCompte,double montant,int idConseiller);
	public boolean virement(String idCompte1,String idCompte2,double montant,int idConseiller);

}
