package com.jit.proxiBanqueV4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jit.proxiBanqueV4.entites.Client;

public interface IClientDao extends JpaRepository<Client, Long> {

}
