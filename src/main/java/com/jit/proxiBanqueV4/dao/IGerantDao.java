package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.proxiBanqueV4.entites.Gerant;
/**
 * 
 * @author Habachi,Cadi,Bourkha,Sid-Elkhir,Nouri
 *
 */
public interface IGerantDao extends JpaRepository<Gerant, Long> {

	@Query("select g from Gerant g  where g.emailGerant=:E and g.password=:P")
	public Gerant seConnecter(@Param("E")String emailGerant,@Param("P")String password);
}
