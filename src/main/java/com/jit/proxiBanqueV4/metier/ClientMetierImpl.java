/**
 * package Metier
 */
package com.jit.proxiBanqueV4.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jit.proxiBanqueV4.dao.IClientDao;
import com.jit.proxiBanqueV4.dao.ICompteDao;
import com.jit.proxiBanqueV4.entites.Client;
/**
  * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 */
/**
 * Class metier
 */
@Service
public class ClientMetierImpl implements IClientMetier {
	@Autowired
	private IClientDao clientDao;
	@Autowired
	private ICompteDao compteDao;
	@Override
	public Client saveClient(Client client) {
		return clientDao.save(client);
	}

	@Override
	public List<Client> listeClients() {
		return clientDao.findAll();
	}

	@Override
	public Client getClient(Long idClient) {
		return clientDao.getOne(idClient) ;
	}
  /**
   * Fonction de supression d'un client
   */
	@Override
	public boolean deleteClient(Long idClient) {
		Client client=getClient(idClient);
		clientDao.delete(client);
		compteDao.deleteCompteByIdClient(idClient);
		return true;
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

}
