package com.sm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sm.entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

}
