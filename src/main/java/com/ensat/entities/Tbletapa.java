package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tbletapa database table.
 * 
 */
@Entity
@NamedQuery(name="Tbletapa.findAll", query="SELECT t FROM Tbletapa t")
public class Tbletapa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEtapa;

	private byte etapainterna;

	private String nombreEtapa;

	//bi-directional many-to-one association to Tblaccionreporte
	@OneToMany(mappedBy="tbletapa")
	private List<Tblaccionreporte> tblaccionreportes;

	public Tbletapa() {
	}

	public int getIdEtapa() {
		return this.idEtapa;
	}

	public void setIdEtapa(int idEtapa) {
		this.idEtapa = idEtapa;
	}

	public byte getEtapainterna() {
		return this.etapainterna;
	}

	public void setEtapainterna(byte etapainterna) {
		this.etapainterna = etapainterna;
	}

	public String getNombreEtapa() {
		return this.nombreEtapa;
	}

	public void setNombreEtapa(String nombreEtapa) {
		this.nombreEtapa = nombreEtapa;
	}

	public List<Tblaccionreporte> getTblaccionreportes() {
		return this.tblaccionreportes;
	}

	public void setTblaccionreportes(List<Tblaccionreporte> tblaccionreportes) {
		this.tblaccionreportes = tblaccionreportes;
	}

	public Tblaccionreporte addTblaccionreporte(Tblaccionreporte tblaccionreporte) {
		getTblaccionreportes().add(tblaccionreporte);
		tblaccionreporte.setTbletapa(this);

		return tblaccionreporte;
	}

	public Tblaccionreporte removeTblaccionreporte(Tblaccionreporte tblaccionreporte) {
		getTblaccionreportes().remove(tblaccionreporte);
		tblaccionreporte.setTbletapa(null);

		return tblaccionreporte;
	}

}