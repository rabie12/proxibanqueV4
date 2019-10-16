package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.proxiBanqueV4.entites.Gerant;

public interface IGerantDao extends JpaRepository<Gerant, Long> {

}
