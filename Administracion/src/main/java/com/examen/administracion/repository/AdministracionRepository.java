package com.examen.administracion.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.administracion.entity.AdministracionUsuario;

@Repository
public interface AdministracionRepository extends JpaRepository<AdministracionUsuario, Long>{
	@Query("SELECT a FROM AdministracionUsuario a WHERE a.correo=?1")
    Optional<AdministracionUsuario> findByEmail(String correo);
}
