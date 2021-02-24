package com.sm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.entities.Clientes;
import com.sm.entities.Colaborador;
import com.sm.entities.Contratos;
import com.sm.entities.Motos;
import com.sm.repositories.ClientesRepository;
import com.sm.repositories.ColaboradoresRepository;
import com.sm.repositories.ContratosRepository;
import com.sm.repositories.MotosRepository;
import com.sm.services.exception.ResourceNotFoundException;



@Service
public class ContratosService {
	@Autowired
	private ContratosRepository repository;
	
	public List<Contratos> findAll(){
		return repository.findAll();
	}
	

	public Contratos findById(Long id) {
		Optional<Contratos> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Contratos insert(Contratos obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Contratos update(Long id, Contratos obj) {
		Contratos entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Contratos entity, Contratos obj) {
		

		
	}
}
