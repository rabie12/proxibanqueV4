package com.jit.proxiBanqueV4.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IParametrageDao;
import com.jit.proxiBanqueV4.entites.Parametrage;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe parametrageMetierImpl qui implémente l'interface IParametrageMetier
=======
/**
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Service
public class parametrageMetierImpl implements IParametrageMetier {
	@Autowired
	IParametrageDao parametrageDao;
	/**
	 * Méthode qui permet de modifier les statistique par défault
	 */
	@Override
	public boolean controlerStatistique(Parametrage parametrage) {
		Parametrage parametrageOld=parametrageDao.getOne(parametrage.getIdParametrage());
		parametrageOld.setCommission(parametrage.getCommission());
		parametrageOld.setNbrClients(parametrage.getNbrClients());
		parametrageOld.setNbrConseillers(parametrage.getNbrConseillers());
		parametrageOld.setStyleGraphe(parametrage.getStyleGraphe());
		parametrageDao.save(parametrageOld);
		return true;
	}
	/**
	 * Méthode qui permet de récupérer un Paramètrage
	 */
	@Override
	public Parametrage getParametrage(Long idParametrage) {
		return parametrageDao.getOne(idParametrage);
	}
	/**
	 * Méthode qui permet l'authentification du paramètrage
	 */
	@Override
	public int seConnecter(String login, String password) {
		return parametrageDao.seConnecter(login, password);
	}
	

}
