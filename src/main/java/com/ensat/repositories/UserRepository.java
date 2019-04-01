package com.ensat.repositories;

//import com.ensat.entities.Product;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ensat.entities.Tblusuario;


public interface UserRepository extends CrudRepository<Tblusuario, Integer> {
	   
	@Query(value = "SELECT nombres, apellidos FROM Tblusuario u", nativeQuery = true)
		Iterable<Tblusuario> findAll();
	
	@Query(value="SELECT * FROM Tblusuario U inner join tblrol R ON R.idrol = U.fk_idRol inner join tblcargo C ON C.idcargo = U.idcargo WHERE U.codigo_usuario = :codigo_usuario", nativeQuery = true)
	Tblusuario findOne(@Param("codigo_usuario") int codigo_usuario);
		
}