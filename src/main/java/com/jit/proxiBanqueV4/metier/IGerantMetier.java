package com.jit.proxiBanqueV4.metier;

import java.util.List;

import com.jit.proxiBanqueV4.entites.Client;
import com.jit.proxiBanqueV4.entites.Conseiller;
import com.jit.proxiBanqueV4.entites.Gerant;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IGerantMetier {
	public Gerant saveGerant(Gerant gerant);
	public List<Gerant> listeGerants();
	public Gerant seConnecter(String emailGerant,String password);
	
	
	

	public Conseiller saveConseiller(Conseiller conseiller);

	public List<Conseiller> listeConseillers();
	
	public boolean affecterClient(Long idClient,int idConseiller);
	
	public List<Client> alertDecouvert(); 
}
