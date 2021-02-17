package com.sm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.services.exception.ResourceNotFoundException;
import com.sm.entities.Usuarios;
import com.sm.repositories.UsuarioRepository;

@Service
public class UsuariosService {
	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuarios> findAll(){
		return repository.findAll();
	}
	

	public Usuarios findById(Long id) {
		Optional<Usuarios> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Usuarios insert(Usuarios obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Usuarios update(Long id, Usuarios obj) {
		Usuarios entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(Usuarios entity, Usuarios obj) {
		entity.setLogin(obj.getLogin());
		entity.setSenha(obj.getSenha());
		entity.setFuncao(obj.getFuncao());
		
	}
}
