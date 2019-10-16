package com.jit.proxiBanqueV4.metier;

import java.util.List;

import com.jit.proxiBanqueV4.entites.Client;

public interface IClientMetier {
	public Client saveClient(Client client);
	public List<Client> listeClients();
	public Client getClient(Long idClient);
	public boolean deleteClient(Long idClient);
	public boolean updateClient(Client client);

}
