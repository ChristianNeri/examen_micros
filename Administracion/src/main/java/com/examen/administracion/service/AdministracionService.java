package com.examen.administracion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.administracion.entity.AdministracionUsuario;
import com.examen.administracion.repository.AdministracionRepository;

@Service
public class AdministracionService {
	private final AdministracionRepository administracionRepository;

	
	@Autowired
	public AdministracionService(AdministracionRepository administracionRepository) {
		this.administracionRepository = administracionRepository;
	}
	
	
	public List<AdministracionUsuario> getAllUsuarios(){
		return administracionRepository.findAll();
	}
	
	public AdministracionUsuario getUsuario(Long id) {
		return administracionRepository.findById(id).orElseThrow(()-> new IllegalStateException("El cliente con el id" + id + "no existe"));
	}
	
	public void deleteUsuario(Long id) {
		if(administracionRepository.existsById(id)) {
			administracionRepository.deleteById(id);
		}else {
			throw new IllegalStateException("El usuario con el id" + id + "no existe");
		}
	}
	
}
