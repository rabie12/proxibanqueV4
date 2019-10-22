package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jit.proxiBanqueV4.entites.Compte;
/**
<<<<<<< HEAD
 * Interface ICompteDao qui hérite de l'interface de JpaRepository
=======
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
>>>>>>> branch 'master' of https://github.com/rabie12/proxibanqueV4.git
 */
public interface ICompteDao extends JpaRepository<Compte, String> {
	/**
	 * Méthode qui permet de supprimer de la BD un compte par idClient
	 * @param idClient
	 */
	@Transactional
	@Modifying
	@Query("delete from Compte c where c.client.idClient=:X")
	public void deleteCompteByIdClient(@Param("X") Long idClient);

}
