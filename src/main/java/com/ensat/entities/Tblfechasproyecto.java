package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the tblfechasproyecto database table.
 * 
 */
@Entity
@NamedQuery(name="Tblfechasproyecto.findAll", query="SELECT t FROM Tblfechasproyecto t")
public class Tblfechasproyecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id_fechas_Proyecto;

	private Timestamp fechaCambio;

	@Temporal(TemporalType.DATE)
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	//bi-directional many-to-one association to Tblproyectoetapa
	@ManyToOne
	@JoinColumn(name="fk_id_ProyectoEtapa")
	private Tblproyectoetapa tblproyectoetapa;

	public Tblfechasproyecto() {
	}

	public int getId_fechas_Proyecto() {
		return this.id_fechas_Proyecto;
	}

	public void setId_fechas_Proyecto(int id_fechas_Proyecto) {
		this.id_fechas_Proyecto = id_fechas_Proyecto;
	}

	public Timestamp getFechaCambio() {
		return this.fechaCambio;
	}

	public void setFechaCambio(Timestamp fechaCambio) {
		this.fechaCambio = fechaCambio;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Tblproyectoetapa getTblproyectoetapa() {
		return this.tblproyectoetapa;
	}

	public void setTblproyectoetapa(Tblproyectoetapa tblproyectoetapa) {
		this.tblproyectoetapa = tblproyectoetapa;
	}

}