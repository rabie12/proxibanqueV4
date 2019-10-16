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
import com.jit.proxiBanqueV4.entites.Parametrage;
@Service
public class ConseillerMetierImpl implements IConseillerMetier {
	@Autowired
	private IConseillerDao conseillerDao;
	@Autowired
	private IClientDao clientDao;
	@Autowired
	private ICompteDao compteDao;
	@Override
	public Conseiller saveConseiller(Conseiller conseiller) {
		return conseillerDao.save(conseiller);
	}

	@Override
	public List<Conseiller> listeConseillers() {
		return conseillerDao.findAll();
	}

	@Override
	public Client createClient(Client client,double solde) {
		clientDao.save(client);
		Compte compteC=new CompteCourant(new Date(),solde,Parametrage.getDecouvert());
		compteC.setClient(client);
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
	public List<Client> listeClients(Long idConseiller) {
		return clientDao.findByIdConseiller(idConseiller);
	}

	@Override
	public List<Client> alertDecouvert(Long idConseiller) {
		return clientDao.alertDecouvert(idConseiller);
	}
}
