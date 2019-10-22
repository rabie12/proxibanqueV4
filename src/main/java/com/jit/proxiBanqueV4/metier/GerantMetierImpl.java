package com.jit.proxiBanqueV4.metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IClientDao;
import com.jit.proxiBanqueV4.dao.IConseillerDao;
import com.jit.proxiBanqueV4.dao.IGerantDao;
import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.entites.Gerant;
<<<<<<< HEAD
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe GérantMetierImplt qui implémente l'interfeace IGerantMetier
=======
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
@Service
public class GerantMetierImpl implements IGerantMetier {
	@Autowired
	private IGerantDao gerantDao;
	@Autowired
	private IConseillerDao conseillerDao;
	@Autowired
	private IClientDao clientDao;
	
	/**
	 * Méthode qui permet d'ajouter un gérant 
	 */
	@Override
	public Gerant saveGerant(Gerant gerant) {
		return gerantDao.save(gerant);
	}
	/**
	 * Méthode qui permet de lister les gérants
	 */
	@Override
	public List<Gerant> listeGerants() {
		return gerantDao.findAll();
	}
	/**
	 * Méthode qui permet d'ajouter un conseiller
	 */
	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		return conseillerDao.save(conseiller);
	}
	/**
	 * Méthode qui permet de lister les conseillers
	 */
	@Override
	public List<Conseiller> listeConseillers() {
		return conseillerDao.findAll();
	}
	/**
	 * méthode qui permet d'affécter un Client à un Conseiller
	 */
	@Override
	@Transactional
	public boolean affecterClient(Long idClient,int idConseiller) {
		Client client=clientDao.findById(idClient).orElse(null);
		Conseiller conseiller=conseillerDao.findById(idConseiller).orElse(null);
		client.setConseiller(conseiller);
		clientDao.save(client);
		return true;
	}
	/**
	 * Méthode qui permet d'alerter le gérant concernant les clients à découvert
	 */
	@Override
	public List<Client> alertDecouvert() {
		return clientDao.alertDecouvert();
	}
	/**
	 * Méthode qui permet l'authentification d'un conseiller
	 */
	@Override
	public Integer seConnecter(String emailGerant, String password) {
		return gerantDao.seConnecter(emailGerant, password);
	}

}
