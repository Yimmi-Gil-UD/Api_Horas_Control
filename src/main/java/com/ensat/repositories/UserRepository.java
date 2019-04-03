package com.ensat.repositories;

import java.util.Optional;

//import com.ensat.entities.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ensat.entities.Tblusuario;

@Repository
public interface UserRepository extends CrudRepository<Tblusuario, Integer> {

	@Query(value = "SELECT nombres, apellidos FROM Tblusuario u", nativeQuery = true)
	Iterable<Tblusuario> findAll();

	Optional<Tblusuario> findOne(@Param("codigo_usuario") Long codigo_usuario);
}