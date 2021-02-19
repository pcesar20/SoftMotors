package com.sm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.services.exception.ResourceNotFoundException;
import com.sm.entities.Motos;
import com.sm.repositories.MotosRepository;



@Service
public class MotosService {
	@Autowired
	private MotosRepository repository;
	
	public List<Motos> findAll(){
		return repository.findAll();
	}
	

	public Motos findById(Long id) {
		Optional<Motos> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Motos insert(Motos obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Motos update(Long id, Motos obj) {
		Motos entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Motos entity, Motos obj) {
		entity.setValor_venda(obj.getValor_venda());

		
	}
}
