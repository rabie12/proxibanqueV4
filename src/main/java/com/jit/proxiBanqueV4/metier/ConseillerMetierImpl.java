package com.jit.proxiBanqueV4.metier;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IClientDao;
import com.jit.proxiBanqueV4.dao.ICompteDao;
import com.jit.proxiBanqueV4.dao.IConseillerDao;
import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Compte;
import com.jit.proxiBanqueV4.entites.CompteCourant;
import com.jit.proxiBanqueV4.entites.Conseiller;
/** 
 * @author Habachi,Cadi,Bourkha,Sidelkhir,Nouri
 */
/**
 * Classe ConseillerMetier qui imlplémente l'interface IConseillerMetier
 */
@Service
public class ConseillerMetierImpl implements IConseillerMetier {
	@Autowired
	private IConseillerDao conseillerDao;
	@Autowired
	private IClientDao clientDao;
	@Autowired
	private ICompteDao compteDao;
	@Autowired
	private ICompteMetier compteMetier;
	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		return conseillerDao.save(conseiller);
	}

	@Override
	public List<Conseiller> listeConseillers() {
		return conseillerDao.findAll();
	}

	@Override
	public Client createClient(Client client) {
		clientDao.save(client);
		Compte compteC=new CompteCourant(new Date(),20,3000);
		compteMetier.idCompte();
		String idCompte="CC"+compteMetier.idCompte();
		compteC.setIdCompte(idCompte);
		compteC.setClient(client);
		Conseiller conseiller=new Conseiller();
		conseiller.setIdConseiller(client.getConseiller().getIdConseiller());
		compteC.setConseiller(conseiller);
		compteDao.save(compteC);
		return client;
		
	}

	@Override
	public boolean updateClient(Client client) {
		Client clientOld=getClient(client.getIdClient());
		clientOld.setNomClient(client.getNomClient());
		clientOld.setPrenomClient(client.getPrenomClient());
		clientOld.setEmailClient(client.getEmailClient());
		clientOld.setAdresseClient(client.getAdresseClient());
		clientDao.save(clientOld);
		return true;

}

	@Override
	public Client getClient(Long idClient) {
		return clientDao.getOne(idClient) ;
	}
	@Override
	public List<Client> listeClients(int idConseiller) {
		return clientDao.findByIdConseiller(idConseiller);
	}

	@Override
	public List<Client> alertDecouvert(int idConseiller) {
		return clientDao.alertDecouvert(idConseiller);
	}

	@Override
	public Conseiller getConseiller(int idConseiller) {
		return conseillerDao.getOne(idConseiller);
	}

	@Override
	public boolean updateConseiller(Conseiller conseiller) {
		Conseiller conseillerOld=getConseiller(conseiller.getIdConseiller());
		conseillerOld.setNomConseiller(conseiller.getNomConseiller());
		conseillerOld.setPrenomConseiller(conseiller.getPrenomConseiller());
		conseillerOld.setEmailConseiller(conseiller.getEmailConseiller());
		conseillerOld.setAdresseConseiller(conseiller.getAdresseConseiller());
		conseillerDao.save(conseillerOld);
		return true;
	}

	@Override
	public boolean deleteConseiller(int idConseiller) {
		Conseiller conseiller=getConseiller(idConseiller);
		conseillerDao.delete(conseiller);
		return true;
	}

	@Override
	public int seConnecter(String emailConseiller, String password) {
		return conseillerDao.seConnecter(emailConseiller, password);
	}

	

	
}
