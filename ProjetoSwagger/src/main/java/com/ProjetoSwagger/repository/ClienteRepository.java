package com.ProjetoSwagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSwagger.entities.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long>{

}
