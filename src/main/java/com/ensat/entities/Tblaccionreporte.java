package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tblaccionreporte database table.
 * 
 */
@Entity
@NamedQuery(name="Tblaccionreporte.findAll", query="SELECT t FROM Tblaccionreporte t")
public class Tblaccionreporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int codigoAcRepo;

	private String estado;

	private String nombre;

	private byte tipo;

	//bi-directional many-to-one association to Tblrol
	@ManyToOne
	@JoinColumn(name="codigoRol")
	private Tblrol tblrol;

	//bi-directional many-to-one association to Tbletapa
	@ManyToOne
	@JoinColumn(name="codigoEtapa")
	private Tbletapa tbletapa;

	public Tblaccionreporte() {
	}

	public int getCodigoAcRepo() {
		return this.codigoAcRepo;
	}

	public void setCodigoAcRepo(int codigoAcRepo) {
		this.codigoAcRepo = codigoAcRepo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getTipo() {
		return this.tipo;
	}

	public void setTipo(byte tipo) {
		this.tipo = tipo;
	}

	public Tblrol getTblrol() {
		return this.tblrol;
	}

	public void setTblrol(Tblrol tblrol) {
		this.tblrol = tblrol;
	}

	public Tbletapa getTbletapa() {
		return this.tbletapa;
	}

	public void setTbletapa(Tbletapa tbletapa) {
		this.tbletapa = tbletapa;
	}

}