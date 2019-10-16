package com.jit.proxiBanqueV4.metier;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.ICompteDao;
import com.jit.proxiBanqueV4.entites.Compte;
@Service
public class CompteMetierImpl implements ICompteMetier {
	@Autowired
	private ICompteDao compteDao;
	@Override
	public Compte saveCompte(Compte compte) {
		compte.setDateCreation(new Date());
		return compteDao.save(compte);
	}

	@Override
	public Compte getCompteById(String idCompte) {
		return compteDao.getOne(idCompte);
	}

}
