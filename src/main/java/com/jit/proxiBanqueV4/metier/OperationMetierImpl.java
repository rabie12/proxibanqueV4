package com.jit.proxiBanqueV4.metier;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.ICompteDao;
import com.jit.proxiBanqueV4.dao.IConseillerDao;
import com.jit.proxiBanqueV4.dao.IOperationDao;
import com.jit.proxiBanqueV4.entites.Compte;
import com.jit.proxiBanqueV4.entites.CompteCourant;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.entites.Operation;
import com.jit.proxiBanqueV4.entites.Retrait;
import com.jit.proxiBanqueV4.entites.Versement;

/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe OperationMetierImpl qui implémente l'interface IOperationMetier
 */
@Service
public class OperationMetierImpl implements IOperationMetier {
	@Autowired
	private IOperationDao operationDao;
	@Autowired
	private ICompteDao compteDao;
	@Autowired
	private IConseillerDao conseillerDao;

	/**
	 * méthode qui permet de créditer un compte, elle recoit 3 paramètre(String
	 * idCompte, double montant, int idConseiller)
	 */
	@Override
	@Transactional
	public boolean verser(String idCompte, double montant, int idConseiller) {
		Compte compte = compteDao.findById(idCompte).orElse(null);
		Conseiller conseiller = conseillerDao.getOne(idConseiller);
		Operation operation = new Versement();
		operation.setDateOperation(new Date());
		operation.setMontant(montant);
		operation.setCompte(compte);
		operation.setConseiller(conseiller);
		operationDao.save(operation);
		compte.setSolde(compte.getSolde() + montant);
		compteDao.save(compte);
		return true;
	}
	/**
	 * méthode qui permet de débiter un compte 
	 */
	@Override
	@Transactional
	public boolean retirer(String idCompte, double montant, int idConseiller) {
		Compte compte = compteDao.findById(idCompte).orElse(null);
		double decouvert = 0;
		if (compte instanceof CompteCourant) {
			decouvert = ((CompteCourant) compte).getDecouvert();
		}
		if (compte.getSolde() + decouvert < montant)
			throw new RuntimeException("solde insuffisant!");
		Conseiller conseiller = conseillerDao.getOne(idConseiller);
		Operation operation = new Retrait();
		operation.setDateOperation(new Date());
		operation.setMontant(montant);
		operation.setCompte(compte);
		operation.setConseiller(conseiller);
		operationDao.save(operation);
		compte.setSolde(compte.getSolde() - montant);

		return true;
	}
	/**
	 * Méthode qui permet le virement compte à compte
	 */
	@Override
	public boolean virement(String idCompte1, String idCompte2, double montant, int idConseiller) {
		retirer(idCompte1, montant, idConseiller);
		verser(idCompte2, montant, idConseiller);

		return true;
	}

}
