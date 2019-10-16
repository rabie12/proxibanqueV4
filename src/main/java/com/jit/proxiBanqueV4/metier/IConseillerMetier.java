package com.jit.proxiBanqueV4.metier;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;

public interface IConseillerMetier {
	public Conseiller saveConseiller(Conseiller conseiller);
	public List<Conseiller> listeConseillers();
	public Client createClient(Client client,double solde);
	public Client getClient(Long idClient);
	public boolean updateClient(Client client);
	public List<Client> listeClients(Long idConseiller);
	public List<Client> alertDecouvert(Long idConseiller);
	

}
