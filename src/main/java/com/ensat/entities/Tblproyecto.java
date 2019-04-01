package com.ensat.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "tblproyecto")
@NamedQuery(name="Tblproyecto.findAll", query="SELECT t FROM Tblproyecto t")
public class Tblproyecto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_proyecto")
	public int id_proyecto;
	
	@Column(name="id_cliente")
	public int id_cliente;
	
	@Column(name="nombre_proyecto")
	public String nombre_proyecto;
	
	@Column(name="id_departamento")
	public int id_departamento;
	
	@Column(name="secuencia_cliente")
	public String secuencia_cliente;
	
	@Column(name="id_gerente")
	public int id_gerente;
	
	@Column(name="fecha_creacion")
	public Date fecha_creacion;
	
	@Column(name="horas_valoradas")
	public int horas_valoradas;
	
	@Column(name="id_uso_creador")
	public int id_uso_creador;
	
	@Column(name="valor")
	public String valor;
	
	@Column(name="fecha_dt")
	public Date fecha_dt;
	
	@Column(name="fecha_calidad")
	public Date fecha_calidad;
	
	@Column(name="fecha_produccion")
	public Date fecha_produccion;
	
	@Column(name="fecha_inicio")
	public Date fecha_inicio;
	
	@Column(name="fecha_fin")
	public Date fecha_fin;
	
	@Column(name="proyinterno")
	public int proyinterno;
	
	@Column(name="margen_previsto")
	public String margen_previsto;
	
	@Column(name="probabilidad_asignacion")
	public String probabilidad_asignacion;
	
	@Column(name="fk_id_estado")
	public int fk_id_estado;
	
	@Column(name="tipo_proyecto")
	public int tipo_proyecto;
	
	
	//bi-directional many-to-one association to Tblcliente
		@ManyToOne
		@JoinColumn(name="idestado")
		private Tblestado tblestado;
		
		

	public int getId_proyecto() {
		return id_proyecto;
	}

	public void setId_proyecto(int id_proyecto) {
		this.id_proyecto = id_proyecto;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre_proyecto() {
		return nombre_proyecto;
	}

	public void setNombre_proyecto(String nombre_proyecto) {
		this.nombre_proyecto = nombre_proyecto;
	}

	public int getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getSecuencia_cliente() {
		return secuencia_cliente;
	}

	public void setSecuencia_cliente(String secuencia_cliente) {
		this.secuencia_cliente = secuencia_cliente;
	}

	public int getId_gerente() {
		return id_gerente;
	}

	public void setId_gerente(int id_gerente) {
		this.id_gerente = id_gerente;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public int getHoras_valoradas() {
		return horas_valoradas;
	}

	public void setHoras_valoradas(int horas_valoradas) {
		this.horas_valoradas = horas_valoradas;
	}

	public int getId_uso_creador() {
		return id_uso_creador;
	}

	public void setId_uso_creador(int id_uso_creador) {
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

	public int getProyinterno() {
		return proyinterno;
	}

	public void setProyinterno(int proyinterno) {
		this.proyinterno = proyinterno;
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

	

	public int getFk_id_estado() {
		return fk_id_estado;
	}

	public void setFk_id_estado(int fk_id_estado) {
		this.fk_id_estado = fk_id_estado;
	}

	public Tblestado getTblestado() {
		return tblestado;
	}

	public void setTblestado(Tblestado tblestado) {
		this.tblestado = tblestado;
	}

	public int getTipo_proyecto() {
		return tipo_proyecto;
	}

	public void setTipo_proyecto(int tipo_proyecto) {
		this.tipo_proyecto = tipo_proyecto;
	}
	
	
public Tblproyecto() {
		
	}
	
	

}
