package com.sm.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sm.entities.Usuarios;
import com.sm.services.UsuariosService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuariosResource {
	
	@Autowired
	UsuariosService service;
	
	@GetMapping
	public ResponseEntity<List<Usuarios>> findAll() {
//		User u = new User(1L, "Paulo", "pc@pcsoft.com","55554444", "12345");
		List<Usuarios> list = service.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuarios> findByUd(@PathVariable Long id) {
		Usuarios obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@PostMapping
	public ResponseEntity<Usuarios> insert(@RequestBody Usuarios obj) {
		obj = service.insert(obj);
//		return ResponseEntity.ok().body(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return (ResponseEntity<Usuarios>) ResponseEntity.created(uri).body(obj);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Usuarios> update(@PathVariable Long id, @RequestBody Usuarios obj) {
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
