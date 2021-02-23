package com.sm.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sm.entities.Motos;
import com.sm.entities.*;
import com.sm.repositories.MotosRepository;
import com.sm.repositories.UsuarioRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	UsuarioRepository usuariosRepository;
	
	@Autowired
	MotosRepository motosRepository;

	@Override
	public void run(String... args) throws Exception {
		Motos moto1 = new Motos(null, "ABC123", "2019", "2020", "TITAN", "AZUL", "3000");
		Motos motos2 = new Motos(null, "ABC123", "2019", "2020", "XT600", "AZUL", "23000");
		Usuarios usuario1 = new Usuarios(null, "psex", "123", "123", "adm");
		
		usuariosRepository.saveAll(Arrays.asList(usuario1));
		motosRepository.saveAll(Arrays.asList(moto1, motos2));
		
	}
}
