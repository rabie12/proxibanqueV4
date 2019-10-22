package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Conseiller;
/**
 * Interface IConseillerDao qui hérite de l'interface de JpaRepository
 */
public interface IConseillerDao extends JpaRepository<Conseiller, Integer> {
	/**
	 * Méthode qui permet l'authentification d'un conseiller
	 * @param emailConseiller
	 * @param password
	 * @return Integer
	 */
	@Query("select c.idConseiller from Conseiller c where c.emailConseiller=:E and c.password=:P")
	public Integer seConnecter(@Param("E")String emailConseiller,@Param("P")String password);

}
