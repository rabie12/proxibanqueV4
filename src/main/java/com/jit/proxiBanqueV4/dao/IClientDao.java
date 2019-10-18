package com.jit.proxiBanqueV4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Client;


public interface IClientDao extends JpaRepository<Client, Long> {
	@Query("select c from Client c where c.conseiller.idConseiller=:X")
	public List<Client> findByIdConseiller(@Param("X") Long idConseiller);


	@Query("select c from Client c INNER JOIN Compte cp on c.idClient=cp.client.idClient where cp.solde<0 and c.conseiller.idConseiller=:X")
	public List<Client> alertDecouvert(@Param("X") Long idConseiller);
	


	@Query("select c from Client c INNER JOIN Compte cp on c.idClient=cp.client.idClient where cp.solde<0")
	public List<Client> alertDecouvert();
	

}
