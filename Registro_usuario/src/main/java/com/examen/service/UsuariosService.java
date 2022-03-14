package com.examen.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.usuario;
import com.examen.repository.UsuariosRepository;

@Service
public class UsuariosService {
	private final UsuariosRepository usuariosRepository;
	
	@Autowired
	public UsuariosService(UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	public usuario getUsuario(Long id) {
		return usuariosRepository.findById(id).orElseThrow(()-> new IllegalStateException("El cliente con el id" + id + "no existe"));
	}
	
	public void addUsuario(usuario usuario) {
		Optional<usuario> usuarioByCorreo = 
				usuariosRepository.findByEmail(usuario.getCorreo());
		if(usuarioByCorreo.isPresent()) {
			throw new IllegalStateException("El usuario con el email ya existe");
		}
		usuariosRepository.save(usuario);
	}
	
	@Transactional
	public void updateUsuario(Long id, String nombre,String apellido_materno,String apellido_paterno,String correo, String edad) {
		usuario usr = usuariosRepository.findById(id)
				.orElseThrow(()-> new IllegalStateException("El usuario no existe"));
		if(nombre !=null)
			if((!nombre.isEmpty()) && (! nombre.equals(usr.getNombre()))) {
				usr.setNombre(nombre);
			}//nombre
		
		if(apellido_paterno !=null)
			if((!apellido_paterno.isEmpty()) && (!apellido_paterno.equals(usr.getApellido_paterno()))) {
				usr.setApellido_paterno(apellido_paterno);
			}//aPaterno
		
		if(apellido_materno !=null)
			if((!apellido_materno.isEmpty()) && (!apellido_materno.equals(usr.getApellido_materno()))) {
				usr.setApellido_materno(apellido_materno);
			}//aPaterno
		
		if(correo !=null)
			if((!correo.isEmpty()) && (!correo.equals(usr.getCorreo()))) {
				usr.setCorreo(correo);
			}//correo
		if(edad !=null)
			if((!edad.isEmpty()) && (!edad.equals(usr.getEdad()))) {
				usr.setEdad(edad);
			}//edad
	}
}
