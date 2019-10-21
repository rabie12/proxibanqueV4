package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Conseiller;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IConseillerDao extends JpaRepository<Conseiller, Integer> {

	@Query("select c.idConseiller from Conseiller c where c.emailConseiller=:E and c.password=:P")
	public Integer seConnecter(@Param("E")String emailConseiller,@Param("P")String password);

}
