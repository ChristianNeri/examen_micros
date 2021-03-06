package com.examen.administracion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.administracion.entity.AdministracionUsuario;
import com.examen.administracion.service.AdministracionService;

@RestController
@RequestMapping("/api/administrador/v1")
public class AdministracionController {
	public final AdministracionService administracionService;

	@Autowired
	public AdministracionController(AdministracionService administracionService) {
		this.administracionService = administracionService;
	}
	
	
	
	@GetMapping // /api/administrador
	public List<AdministracionUsuario> getAllUsuarios(){
		return administracionService.getAllUsuarios();
	}
	
	@GetMapping (path="{id}")
	public AdministracionUsuario getUsuario(@PathVariable("id")Long id) {
		return administracionService.getUsuario(id);
	}
	
	@DeleteMapping (path = "{id}")
	public void deleteUsuario(@PathVariable("id") Long id){
		 administracionService.deleteUsuario(id);
	}
	
}
