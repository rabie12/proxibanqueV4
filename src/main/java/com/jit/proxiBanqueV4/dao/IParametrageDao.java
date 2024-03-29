package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Parametrage;
/**
 * Interface IParametrageDao qui hérite de l'interface de JpaRepository
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IParametrageDao extends JpaRepository<Parametrage, Long> {

	/**
	 * Méthode qui permet l'authentification du Profil Paramètrage
	 * @param emailParametrage
	 * @param password
	 * @return parametrage
	 */
	@Query("select g.idParametrage from Parametrage g  where g.login=:l and g.password=:P")
	public int seConnecter(@Param("l")String emailParametrage,@Param("P")String password);



}
