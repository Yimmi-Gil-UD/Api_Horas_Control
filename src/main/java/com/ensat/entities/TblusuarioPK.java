package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the tblusuario database table.
 * 
 */
@Embeddable
public class TblusuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="codigo_usuario")
	private int codigoUsuario;

	@Column(insertable=false, updatable=false)
	private int idRol;

	public TblusuarioPK() {
	}
	public int getCodigoUsuario() {
		return this.codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public int getIdRol() {
		return this.idRol;
	}
	public void setIdRol(int idRol) {
		this.idRol = idRol;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TblusuarioPK)) {
			return false;
		}
		TblusuarioPK castOther = (TblusuarioPK)other;
		return 
			(this.codigoUsuario == castOther.codigoUsuario)
			&& (this.idRol == castOther.idRol);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codigoUsuario;
		hash = hash * prime + this.idRol;
		
		return hash;
	}
}