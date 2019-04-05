package com.ensat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@NamedQueries({
	@NamedQuery(name="Tblproyecto.findAll", query="FROM Tblproyecto")
})
public class Tblproyecto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_proyecto")
	public Long id_proyecto;
	
	@Column(name="id_cliente")
	public Long id_cliente;
	
	@Column(name="nombre_proyecto")
	public String nombre_proyecto;
	
	@Column(name="fk_id_departamento")
	public Long id_departamento;
	
	@Column(name="secuencia_cliente")
	public String secuencia_cliente;
	
	@Column(name="id_gerente")
	public Long id_gerente;
	
	@Column(name="fecha_creacion", nullable=true)
	public Date fecha_creacion;
	
	@Column(name="horas_valoradas")
	public Long horas_valoradas;
	
	@Column(name="id_usu_creador")
	public Long id_uso_creador;
	
	@Column(name="valor")
	public String valor;
	
	@Column(name="fecha_dt")
	public Date fecha_dt;
	
	@Column(name="fecha_calidad", nullable=true)
	public Date fecha_calidad;
	
	@Column(name="fecha_produccion", nullable=true)
	public Date fecha_produccion;
	
	@Column(name="fecha_inicio", nullable=true)
	public Date fecha_inicio;
	
	@Column(name="fecha_fin", nullable=true)
	public Date fecha_fin;
	
	@Column(name="margen_previsto")
	public String margen_previsto;
	
	@Column(name="probabilidad_asignacion")
	public String probabilidad_asignacion;
		
	@Column(name="tipo_proyecto")
	public Long tipo_proyecto;
	/*	
	@ManyToOne
	@JoinColumn(name="fkIdEstado")
	private Tblestado tblestado;
	*/
	/*
	@ManyToOne(optional = true)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "proyinterno")
	private Tbletapa tbletapa;
	*/
	public Tblproyecto() {
		
	}

	public Long getId_proyecto() {
		return id_proyecto;
	}

	public void setId_proyecto(Long id_proyecto) {
		this.id_proyecto = id_proyecto;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_proyecto() {
		return nombre_proyecto;
	}

	public void setNombre_proyecto(String nombre_proyecto) {
		this.nombre_proyecto = nombre_proyecto;
	}

	public Long getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(Long id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getSecuencia_cliente() {
		return secuencia_cliente;
	}

	public void setSecuencia_cliente(String secuencia_cliente) {
		this.secuencia_cliente = secuencia_cliente;
	}

	public Long getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(Long id_gerente) {
		this.id_gerente = id_gerente;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Long getHoras_valoradas() {
		return horas_valoradas;
	}

	public void setHoras_valoradas(Long horas_valoradas) {
		this.horas_valoradas = horas_valoradas;
	}

	public Long getId_uso_creador() {
		return id_uso_creador;
	}

	public void setId_uso_creador(Long id_uso_creador) {
		this.id_uso_creador = id_uso_creador;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Date getFecha_dt() {
		return fecha_dt;
	}

	public void setFecha_dt(Date fecha_dt) {
		this.fecha_dt = fecha_dt;
	}

	public Date getFecha_calidad() {
		return fecha_calidad;
	}

	public void setFecha_calidad(Date fecha_calidad) {
		this.fecha_calidad = fecha_calidad;
	}

	public Date getFecha_produccion() {
		return fecha_produccion;
	}

	public void setFecha_produccion(Date fecha_produccion) {
		this.fecha_produccion = fecha_produccion;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getMargen_previsto() {
		return margen_previsto;
	}

	public void setMargen_previsto(String margen_previsto) {
		this.margen_previsto = margen_previsto;
	}

	public String getProbabilidad_asignacion() {
		return probabilidad_asignacion;
	}

	public void setProbabilidad_asignacion(String probabilidad_asignacion) {
		this.probabilidad_asignacion = probabilidad_asignacion;
	}

	public Long getTipo_proyecto() {
		return tipo_proyecto;
	}

	public void setTipo_proyecto(Long tipo_proyecto) {
		this.tipo_proyecto = tipo_proyecto;
	}
/*
	public Tbletapa getTbletapa() {
		return tbletapa;
	}

	public void setTbletapa(Tbletapa tbletapa) {
		this.tbletapa = tbletapa;
	}*/
}
