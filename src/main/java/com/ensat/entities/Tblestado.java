package com.ensat.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;




/**
 * The persistent class for the tblestado database table.
 * 
 */
@Entity
@Table(name ="tblestado")
@NamedQuery(name="Tblestado.findAll", query="SELECT t FROM Tblestado t")
public class Tblestado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idestado")
	private Long idestado;

	@Column(name="estado")
	private String estado;
	
	
	//bi-directional many-to-one association to Tblproyecto
	/*@OneToMany(mappedBy="tblestado")
	private List<Tblproyecto> tblproyecto;*/
	

	/*public List<Tblproyecto> getTblproyecto() {
		return tblproyecto;
	}

	public void setTblproyecto(List<Tblproyecto> tblproyecto) {
		this.tblproyecto = tblproyecto;
	}*/

	public Tblestado() {
	}

	public Long getIdestado() {
		return this.idestado;
	}

	public void setIdestado(Long idestado) {
		this.idestado = idestado;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}