package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tblproyectoetapa database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name="Tblproyectoetapa.findAll", query="FROM Tblproyectoetapa where idProyecto = :projectId")
})
public class Tblproyectoetapa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idproyectoetapa")
	private Long idproyectoetapa;

	private String facturacion;
	
	@Column(name="idetapaproy")
	private Long idetapaproy;

	@Column(name="idproyecto")
	private Long idproyecto;

	private String pagado;

	private String porcentaje;

	private String valor;

	//bi-directional many-to-one association to Tblfechasproyecto
	@OneToMany(mappedBy="tblproyectoetapa")
	private List<Tblfechasproyecto> tblfechasproyectos;

	public Tblproyectoetapa() {
	}

	public Long getIdProyectoEtapa() {
		return this.idproyectoetapa;
	}

	public void setIdProyectoEtapa(Long idproyectoetapa) {
		this.idproyectoetapa = idproyectoetapa;
	}

	public String getFacturacion() {
		return this.facturacion;
	}

	public void setFacturacion(String facturacion) {
		this.facturacion = facturacion;
	}

	public Long getIdEtapaProy() {
		return this.idetapaproy;
	}

	public void setIdEtapaProy(Long idetapaproy) {
		this.idetapaproy = idetapaproy;
	}

	public Long getIdProyecto() {
		return this.idproyecto;
	}

	public void setIdProyecto(Long idproyecto) {
		this.idproyecto = idproyecto;
	}

	public String getPagado() {
		return this.pagado;
	}

	public void setPagado(String pagado) {
		this.pagado = pagado;
	}

	public String getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public List<Tblfechasproyecto> getTblfechasproyectos() {
		return this.tblfechasproyectos;
	}

	public void setTblfechasproyectos(List<Tblfechasproyecto> tblfechasproyectos) {
		this.tblfechasproyectos = tblfechasproyectos;
	}

	public Tblfechasproyecto addTblfechasproyecto(Tblfechasproyecto tblfechasproyecto) {
		getTblfechasproyectos().add(tblfechasproyecto);
		tblfechasproyecto.setTblproyectoetapa(this);

		return tblfechasproyecto;
	}

	public Tblfechasproyecto removeTblfechasproyecto(Tblfechasproyecto tblfechasproyecto) {
		getTblfechasproyectos().remove(tblfechasproyecto);
		tblfechasproyecto.setTblproyectoetapa(null);

		return tblfechasproyecto;
	}

}