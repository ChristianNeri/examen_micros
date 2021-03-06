package com.examen.publicaciones.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import com.examen.publicaciones.models.Publicacion;
import com.examen.publicaciones.repository.PublicacionRepository;

@Service
public class PublicacionService {
	private final PublicacionRepository publicacionRepository;
	
	//@Autowired
	//private RestTemplate clienteRest;
	
	@Autowired
	public PublicacionService(PublicacionRepository publicacionRepository) {
		this.publicacionRepository = publicacionRepository;
	}
	
	public List<Publicacion> getAllPublicaciones(){
		return publicacionRepository.findAll();
	}
	
	public Publicacion getPublicacion(Long id){
		return publicacionRepository.findById(id).orElseThrow(()-> new IllegalStateException("El mensaje no existe"));
	}
	
	public void deletePublicacion(Long id) {
		if(publicacionRepository.existsById(id)) {
			publicacionRepository.deleteById(id);
		}else {
			throw new IllegalStateException("El mensaje no existe");
		}
	}
	
	public void addPublicacion (Publicacion publicacion) {
		Optional<Publicacion> pubById= publicacionRepository.findById(publicacion.getId());
		if(pubById.isPresent()) {
			throw new IllegalStateException("La publicación ya existe");
		}
		publicacionRepository.save(publicacion);
	}
	
}
