package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.proxiBanqueV4.entites.Compte;

public interface ICompteDao extends JpaRepository<Compte, String> {

}
