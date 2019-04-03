package com.ensat.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tblcargo {

	@Id
	@Column(name = "idcargo")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy="tblcargo")
	private List<Tblusuario> tblusuarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}