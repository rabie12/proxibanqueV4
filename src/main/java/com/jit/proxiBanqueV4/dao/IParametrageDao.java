package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Parametrage;

public interface IParametrageDao extends JpaRepository<Parametrage, Long> {

	@Query("select g from Parametrage g  where g.login=:l and g.password=:P")
	public Parametrage seConnecter(@Param("l")String emailParametrage,@Param("P")String password);
}
