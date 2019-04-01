package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the tblusuario database table.
 * 
 */
@Entity
@NamedQuery(name="Tblusuario.findAll", query="SELECT t FROM Tblusuario t")
public class Tblusuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TblusuarioPK codigo_usuario;

	private String apellidos;

	@Lob
	private byte[] clavesegura;

	@Column(name="contador_visitas")
	private int contadorVisitas;

	private String correo;

	private String correo2;

	private String correo3;

	@Lob
	private String descripcionBaja;

	private String estado;

	private Timestamp fecha_Registro;

	private Timestamp fechaBaja;

	@Temporal(TemporalType.DATE)
	private Date fechaCumpleanios;

	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;

	private int idCargo;

	private BigDecimal identificacion;

	private int idGerente;

	private int idJefe;

	private String imagen;

	private String nick;

	private String nombreGerente;

	private String nombres;

	private String skype;

	@Column(name="sueldo_costo")
	private int sueldoCosto;

	private BigDecimal telFijo;

	private BigDecimal telMovil;

	private BigDecimal telOtro;

	private String tipo;

	private String tipoUsuario;

	@Column(name="ultimo_ingreso")
	private Timestamp ultimoIngreso;

	private int usuRepBaja;

	//bi-directional many-to-one association to Tblrol
	@ManyToOne
	@JoinColumn(name="fk_idRol")
	private Tblrol tblrol;

	public Tblusuario() {
	}

	
	public TblusuarioPK getCodigo_usuario() {
		return codigo_usuario;
	}


	public void setCodigo_usuario(TblusuarioPK codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}


	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public byte[] getClavesegura() {
		return this.clavesegura;
	}

	public void setClavesegura(byte[] clavesegura) {
		this.clavesegura = clavesegura;
	}

	public int getContadorVisitas() {
		return this.contadorVisitas;
	}

	public void setContadorVisitas(int contadorVisitas) {
		this.contadorVisitas = contadorVisitas;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreo2() {
		return this.correo2;
	}

	public void setCorreo2(String correo2) {
		this.correo2 = correo2;
	}

	public String getCorreo3() {
		return this.correo3;
	}

	public void setCorreo3(String correo3) {
		this.correo3 = correo3;
	}

	public String getDescripcionBaja() {
		return this.descripcionBaja;
	}

	public void setDescripcionBaja(String descripcionBaja) {
		this.descripcionBaja = descripcionBaja;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFecha_Registro() {
		return this.fecha_Registro;
	}

	public void setFecha_Registro(Timestamp fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}

	public Timestamp getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public Date getFechaCumpleanios() {
		return this.fechaCumpleanios;
	}

	public void setFechaCumpleanios(Date fechaCumpleanios) {
		this.fechaCumpleanios = fechaCumpleanios;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public BigDecimal getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(BigDecimal identificacion) {
		this.identificacion = identificacion;
	}

	public int getIdGerente() {
		return this.idGerente;
	}

	public void setIdGerente(int idGerente) {
		this.idGerente = idGerente;
	}

	public int getIdJefe() {
		return this.idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombreGerente() {
		return this.nombreGerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombreGerente = nombreGerente;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public int getSueldoCosto() {
		return this.sueldoCosto;
	}

	public void setSueldoCosto(int sueldoCosto) {
		this.sueldoCosto = sueldoCosto;
	}

	public BigDecimal getTelFijo() {
		return this.telFijo;
	}

	public void setTelFijo(BigDecimal telFijo) {
		this.telFijo = telFijo;
	}

	public BigDecimal getTelMovil() {
		return this.telMovil;
	}

	public void setTelMovil(BigDecimal telMovil) {
		this.telMovil = telMovil;
	}

	public BigDecimal getTelOtro() {
		return this.telOtro;
	}

	public void setTelOtro(BigDecimal telOtro) {
		this.telOtro = telOtro;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Timestamp getUltimoIngreso() {
		return this.ultimoIngreso;
	}

	public void setUltimoIngreso(Timestamp ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}

	public int getUsuRepBaja() {
		return this.usuRepBaja;
	}

	public void setUsuRepBaja(int usuRepBaja) {
		this.usuRepBaja = usuRepBaja;
	}

	public Tblrol getTblrol() {
		return this.tblrol;
	}

	public void setTblrol(Tblrol tblrol) {
	this.tblrol = tblrol;
	}

}