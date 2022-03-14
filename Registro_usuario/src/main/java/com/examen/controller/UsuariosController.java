package com.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.usuario;
import com.examen.service.UsuariosService;

@RestController
@RequestMapping("/api/usuarios/v1")
public class UsuariosController {
	public final UsuariosService usuariosService;
	
	@Autowired
	public UsuariosController(UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	
	//@GetMapping (path = "{id}")
	@GetMapping(path = "{id}")
	public usuario getUsuario(@PathVariable("id") Long id) {
		return usuariosService.getUsuario(id);
	}

	
	@PostMapping
	public void addUsuario(@RequestBody usuario usuario) {
		usuariosService.addUsuario(usuario);
	}
	
	@PutMapping(path = "{id}") // /api/usuarios/id
	public void updateUsuario(@PathVariable("id") Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String apellido_materno,
			@RequestParam(required = false) String apellido_paterno,
			@RequestParam(required = false) String correo,
			@RequestParam(required = false) String edad) {
		usuariosService.updateUsuario(id, nombre, apellido_materno, apellido_paterno, correo, edad);
	}
}
