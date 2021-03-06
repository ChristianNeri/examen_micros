package com.examen.publicaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.publicaciones.models.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long>{

}
