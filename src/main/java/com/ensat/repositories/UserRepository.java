package com.ensat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ensat.entities.Tblusuario;

@Repository
public interface UserRepository extends CrudRepository<Tblusuario, Integer>, JpaRepository<Tblusuario, Integer>, UserRepositoryCustom {

}