package com.jit.proxiBanqueV4.metier;

import java.util.List;


import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IConseillerMetier {
	public Conseiller saveConseiller(Conseiller conseiller);
	public List<Conseiller> listeConseillers();
	public Conseiller getConseiller(int idConseiller);
	public boolean updateConseiller(Conseiller conseiller);
	public boolean deleteConseiller(int idConseiller);
	public int seConnecter(String emailConseiller,String password);
	
	
	
	public Client createClient(Client client);
	public Client getClient(Long idClient);
	public boolean updateClient(Client client);
	public List<Client> listeClients(int idConseiller);
	public List<Client> alertDecouvert(int idConseiller);
	
	

}
