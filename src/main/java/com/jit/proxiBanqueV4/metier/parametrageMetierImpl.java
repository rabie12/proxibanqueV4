package com.jit.proxiBanqueV4.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IParametrageDao;
import com.jit.proxiBanqueV4.entites.Parametrage;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe parametrageMetierImpl qui implémente l'interface IParametrageMetier
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
	public Parametrage seConnecter(String login, String password) {
		return parametrageDao.seConnecter(login, password);
	}
	

}
