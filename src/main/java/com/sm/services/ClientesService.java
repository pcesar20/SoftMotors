package com.sm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.entities.Clientes;
import com.sm.entities.Motos;
import com.sm.repositories.ClientesRepository;
import com.sm.repositories.MotosRepository;
import com.sm.services.exception.ResourceNotFoundException;



@Service
public class ClientesService {
	@Autowired
	private ClientesRepository repository;
	
	public List<Clientes> findAll(){
		return repository.findAll();
	}
	

	public Clientes findById(Long id) {
		Optional<Clientes> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Clientes insert(Clientes obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Clientes update(Long id, Clientes obj) {
		Clientes entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Clientes entity, Clientes obj) {
		

		
	}
}
