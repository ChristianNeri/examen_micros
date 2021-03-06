package com.examen.publicaciones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.publicaciones.models.Publicacion;
import com.examen.publicaciones.service.PublicacionService;

@RestController
@RequestMapping("/api/publicaciones/v1")
public class PublicacionController {
	public final PublicacionService publicacionService;
	
	@Autowired
	public PublicacionController(PublicacionService publicacionService) {
		super();
		this.publicacionService = publicacionService;
	}
	
	@GetMapping
	public List<Publicacion> getAllPublicaciones(){
		return publicacionService.getAllPublicaciones();
	}
	
	@GetMapping (path="{id}")
	public Publicacion getPublicacion(@PathVariable("id") Long id) {
		return publicacionService.getPublicacion(id);
	}
	
	@DeleteMapping (path="{id}")
	public void deletePublicacion(@PathVariable("id") Long id) {
		publicacionService.deletePublicacion(id);
	}
	
	@PutMapping(path="{id}")
	public void addPublicacion(@RequestBody Publicacion publicacion) {
		publicacionService.addPublicacion(publicacion);
	}
	
	
}
