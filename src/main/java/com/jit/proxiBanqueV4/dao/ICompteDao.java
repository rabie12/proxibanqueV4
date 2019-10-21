package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jit.proxiBanqueV4.entites.Compte;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface ICompteDao extends JpaRepository<Compte, String> {
	@Transactional
	@Modifying
	@Query("delete from Compte c where c.client.idClient=:X")
	public void deleteCompteByIdClient(@Param("X") Long idClient);

}
