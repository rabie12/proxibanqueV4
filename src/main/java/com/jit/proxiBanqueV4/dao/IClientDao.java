package com.jit.proxiBanqueV4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Client;

/**
 * Interface IClientDao qui hérite de l'interface de JpaRepository
 */
public interface IClientDao extends JpaRepository<Client, Long> {
	/**
	 * Méthode qui permet de récupérer de la BD un conseiller par idConseiller
	 * @param idConseiller
	 * @return listClient
	 */
	@Query("select c from Client c where c.conseiller.idConseiller=:X")
	public List<Client> findByIdConseiller(@Param("X") int idConseiller);

	/**
	 * Méthode qui permet de récupérer de la BD les clients ayant un solde inférieur à zero par idConseiller
	 * @param idConseiller
	 * @return listClient
	 */
	@Query("select c from Client c INNER JOIN Compte cp on c.idClient=cp.client.idClient where cp.solde<0 and c.conseiller.idConseiller=:X")
	public List<Client> alertDecouvert(@Param("X") int idConseiller);
	

	/**
	 * Méthode qui permet de récupérer de la BD tout les clients ayant un solde inférieur à zero
	 * @return listClient
	 */
	@Query("select c from Client c INNER JOIN Compte cp on c.idClient=cp.client.idClient where cp.solde<0")
	public List<Client> alertDecouvert();
	

}
