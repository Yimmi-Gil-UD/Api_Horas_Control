package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbldepartamento database table.
 * 
 */
@Entity
@NamedQuery(name="Tbldepartamento.findAll", query="SELECT t FROM Tbldepartamento t")
public class Tbldepartamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_departamento")
	private int idDepartamento;

	@Column(name="nombre_departamento")
	private String nombreDepartamento;

	//bi-directional many-to-one association to Tblcliente
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Tblcliente tblcliente;

	public Tbldepartamento() {
	}

	public int getIdDepartamento() {
		return this.idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombreDepartamento() {
		return this.nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Tblcliente getTblcliente() {
		return this.tblcliente;
	}

	public void setTblcliente(Tblcliente tblcliente) {
		this.tblcliente = tblcliente;
	}

}