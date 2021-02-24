package com.sm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.entities.Colaborador;
import com.sm.repositories.ColaboradoresRepository;
import com.sm.services.exception.ResourceNotFoundException;



@Service
public class ColaboradorService {
	@Autowired
	private ColaboradoresRepository repository;
	
	public List<Colaborador> findAll(){
		return repository.findAll();
	}
	

	public Colaborador findById(Long id) {
		Optional<Colaborador> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Colaborador insert(Colaborador obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Colaborador update(Long id, Colaborador obj) {
		Colaborador entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Colaborador entity, Colaborador obj) {
		

		
	}
}
