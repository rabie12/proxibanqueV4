package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Parametrage;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IParametrageDao extends JpaRepository<Parametrage, Long> {

	@Query("select g.idParametrage from Parametrage g  where g.login=:l and g.password=:P")
	public Integer seConnecter(@Param("l")String emailParametrage,@Param("P")String password);
}
