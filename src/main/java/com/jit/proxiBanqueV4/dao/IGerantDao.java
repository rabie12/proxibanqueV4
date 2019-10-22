package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Gerant;
/**
 * Interface IGerantDao qui hérite de l'interface de JpaRepository
 */
public interface IGerantDao extends JpaRepository<Gerant, Long> {
	/**
	 * Méthode qui permet l'authentification d'un gérant
	 * @param emailGerant
	 * @param password
	 * @return gerant
	 */
	@Query("select g.idGerant from Gerant g  where g.emailGerant=:E and g.password=:P")
	public Integer seConnecter(@Param("E")String emailGerant,@Param("P")String password);
}
