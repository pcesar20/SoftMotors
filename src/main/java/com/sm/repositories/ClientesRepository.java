package com.sm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sm.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
