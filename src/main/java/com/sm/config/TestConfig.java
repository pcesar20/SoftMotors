package com.sm.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sm.entities.Usuarios;
import com.sm.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	UsuarioRepository usuariosRepository;

	@Override
	public void run(String... args) throws Exception {
		Usuarios usuario1 = new Usuarios(null, "psex", "123", "123", "adm");
		
		usuariosRepository.saveAll(Arrays.asList(usuario1));
		
	}
}
