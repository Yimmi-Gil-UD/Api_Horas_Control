package com.ensat.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the tblrol database table.
 * 
 */
@Entity
@NamedQuery(name="Tblrol.findAll", query="SELECT t FROM Tblrol t")
public class Tblrol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idrol;

	private byte esadmin;

	private String nombrerol;
	
	@OneToMany(mappedBy="tblrol")
	private List<Tblusuario> tblusuarios;

	public Tblrol() {
	}

	public int getIdrol() {
		return this.idrol;
	}

	public void setIdrol(int idrol) {
		this.idrol = idrol;
	}

	public byte getEsadmin() {
		return this.esadmin;
	}

	public void setEsadmin(byte esadmin) {
		this.esadmin = esadmin;
	}

	public String getNombrerol() {
		return this.nombrerol;
	}

	public void setNombrerol(String nombrerol) {
		this.nombrerol = nombrerol;
	}

}