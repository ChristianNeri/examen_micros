package com.examen.repository;



import com.examen.entity.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuariosRepository extends JpaRepository<usuario, Long>{
	//@Query("SELECT u FROM usuario u WHERE u.nombre=?1")
    //Optional<Usuario> findByName(String nombre);
    @Query("SELECT u FROM usuario u WHERE u.correo=?1")
    Optional<usuario> findByEmail(String correo);
}
