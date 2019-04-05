package com.ensat.repositories;

import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ensat.entities.Tblusuario;

@Repository
public interface UserRepositoryCustom {
	
	Optional<Tblusuario> findOne(@Param("codigo_usuario") Long codigo_usuario);
	
	Tblusuario findByLoginAndPassword(@Param("nick") String nick);
	
	void updatePassword();
}
