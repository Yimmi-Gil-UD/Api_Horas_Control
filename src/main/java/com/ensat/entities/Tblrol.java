package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tblrol database table.
 * 
 */
@Entity
@NamedQuery(name="Tblrol.findAll", query="SELECT t FROM Tblrol t")
public class Tblrol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idrol;

	private byte esadmin;

	private String nombrerol;

	//bi-directional many-to-one association to Tblaccionreporte
	@OneToMany(mappedBy="tblrol")
	private List<Tblaccionreporte> tblaccionreportes;

	//bi-directional many-to-one association to Tblusuario
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

	public List<Tblaccionreporte> getTblaccionreportes() {
		return this.tblaccionreportes;
	}

	public void setTblaccionreportes(List<Tblaccionreporte> tblaccionreportes) {
		this.tblaccionreportes = tblaccionreportes;
	}

	public Tblaccionreporte addTblaccionreporte(Tblaccionreporte tblaccionreporte) {
		getTblaccionreportes().add(tblaccionreporte);
		tblaccionreporte.setTblrol(this);

		return tblaccionreporte;
	}

	public Tblaccionreporte removeTblaccionreporte(Tblaccionreporte tblaccionreporte) {
		getTblaccionreportes().remove(tblaccionreporte);
		tblaccionreporte.setTblrol(null);

		return tblaccionreporte;
	}

	public List<Tblusuario> getTblusuarios() {
		return this.tblusuarios;
	}

	public void setTblusuarios(List<Tblusuario> tblusuarios) {
		this.tblusuarios = tblusuarios;
	}

	public Tblusuario addTblusuario(Tblusuario tblusuario) {
		getTblusuarios().add(tblusuario);
		tblusuario.setTblrol(this);

		return tblusuario;
	}

	public Tblusuario removeTblusuario(Tblusuario tblusuario) {
		getTblusuarios().remove(tblusuario);
		tblusuario.setTblrol(null);

		return tblusuario;
	}

}