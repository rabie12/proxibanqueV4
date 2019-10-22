package com.jit.proxiBanqueV4.metier;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.ICompteDao;
import com.jit.proxiBanqueV4.entites.Compte;
<<<<<<< HEAD

/**
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */

/**
 * Classe CompteMetier qui imlplémente l'interface ICompteMetier
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Service
public class CompteMetierImpl implements ICompteMetier {
	@Autowired
	private ICompteDao compteDao;
	/**
	 * Méthode qui permet d'ajouter un compte
	 */
	@Override
	public Compte saveCompte(Compte compte) {
		compte.setDateCreation(new Date());
		return compteDao.save(compte);
	}
	/**
	 * méthode qui permet de récupérer un compte par idCompte
	 */
	@Override
	public Compte getCompteById(String idCompte) {
		return compteDao.getOne(idCompte);
	}
	/**
	 * Méthode qui permet de gérer idComte
	 */
	@Override
	public BigInteger idCompte() {
		BigInteger bigInteger = new BigInteger("2000000000000");
		BigInteger min = new BigInteger("1000000000");
		BigInteger bigInteger1 = bigInteger.subtract(min);
		Random rnd = new Random();
		int maxNumBitLength = bigInteger.bitLength();

		BigInteger aRandomBigInt;

		aRandomBigInt = new BigInteger(maxNumBitLength, rnd);
		if (aRandomBigInt.compareTo(min) < 0)
			aRandomBigInt = aRandomBigInt.add(min);
		if (aRandomBigInt.compareTo(bigInteger) >= 0)
			aRandomBigInt = aRandomBigInt.mod(bigInteger1).add(min);

		return aRandomBigInt;
	}
	/**
	 * méthode qui permet de lister les comptes
	 */
	@Override
	public List<Compte> listeComptes() {
		return compteDao.findAll();
	}
	/**
	 * méthode qui permet de supprimer un compte à partir d'un idCompte recu en paramètre
	 */
	@Override
	public boolean deleteCompte(String idCompte) {
		Compte compte=getCompteById(idCompte);
		compteDao.delete(compte);
		return false;
	}

}
