package com.ProjetoLombok.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoLombok.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}