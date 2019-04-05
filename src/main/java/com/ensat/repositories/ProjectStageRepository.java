package com.ensat.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ensat.entities.Tbletapa;

public interface ProjectStageRepository extends CrudRepository<Tbletapa, Integer> {

	Iterable<Tbletapa> findAll(@Param("projectId") Long projectId);
}
