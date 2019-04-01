package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tblcliente database table.
 * 
 */
@Entity
@NamedQuery(name="Tblcliente.findAll", query="SELECT t FROM Tblcliente t")
public class Tblcliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idcliente;

	private int nit;

	@Column(name="nombre_cliente")
	private String nombreCliente;

	//bi-directional many-to-one association to Tbldepartamento
	@OneToMany(mappedBy="tblcliente")
	private List<Tbldepartamento> tbldepartamentos;

	public Tblcliente() {
	}

	public int getIdcliente() {
		return this.idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public int getNit() {
		return this.nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public List<Tbldepartamento> getTbldepartamentos() {
		return this.tbldepartamentos;
	}

	public void setTbldepartamentos(List<Tbldepartamento> tbldepartamentos) {
		this.tbldepartamentos = tbldepartamentos;
	}

	public Tbldepartamento addTbldepartamento(Tbldepartamento tbldepartamento) {
		getTbldepartamentos().add(tbldepartamento);
		tbldepartamento.setTblcliente(this);

		return tbldepartamento;
	}

	public Tbldepartamento removeTbldepartamento(Tbldepartamento tbldepartamento) {
		getTbldepartamentos().remove(tbldepartamento);
		tbldepartamento.setTblcliente(null);

		return tbldepartamento;
	}

}