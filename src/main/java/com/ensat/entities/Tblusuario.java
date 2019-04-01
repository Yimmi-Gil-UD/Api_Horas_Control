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
	private TblusuarioPK id;

	private String apellidos;

	@Lob
	private byte[] clavesegura;

	@Column(name="contador_visitas", nullable = true)
	private Integer  contador_visitas;

	private String correo;

	private String correo2;

	private String correo3;

	@Lob
	private String descripcionbaja;

	private String estado;

	private Timestamp fecha_Registro;

	private Timestamp fechabaja;

	@Temporal(TemporalType.DATE)
	private Date fechacumpleanios;

	@Temporal(TemporalType.DATE)
	private Date fechaingreso;

	private int idcargo;

	private BigDecimal identificacion;

	private int idgerente;

	private int idjefe;

	private String imagen;

	private String nick;

	private String nombregerente;

	private String nombres;

	private String skype;

	@Column(name="sueldo_costo")
	private int sueldoCosto;

	private BigDecimal telfijo;

	private BigDecimal telmovil;

	private BigDecimal telotro;

	private String tipo;

	private String tipousuario;

	@Column(name="ultimo_ingreso")
	private Timestamp ultimoIngreso;

	private int usurepbaja;

	public Tblusuario() {
	}

	public TblusuarioPK getId() {
		return this.id;
	}

	public void setId(TblusuarioPK id) {
		this.id = id;
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
		return this.contador_visitas;
	}

	public void setContadorVisitas(Integer contadorVisitas) {
		this.contador_visitas = contadorVisitas;
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
		return this.descripcionbaja;
	}

	public void setDescripcionBaja(String descripcionbaja) {
		this.descripcionbaja = descripcionbaja;
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
		return this.fechabaja;
	}

	public void setFechaBaja(Timestamp fechaBaja) {
		this.fechabaja = fechaBaja;
	}

	public Date getFechaCumpleanios() {
		return this.fechacumpleanios;
	}

	public void setFechaCumpleanios(Date fechacumpleanios) {
		this.fechacumpleanios = fechacumpleanios;
	}

	public Date getFechaIngreso() {
		return this.fechaingreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaingreso = fechaIngreso;
	}

	public int getIdCargo() {
		return this.idcargo;
	}

	public void setIdCargo(int idCargo) {
		this.idcargo = idCargo;
	}

	public BigDecimal getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(BigDecimal identificacion) {
		this.identificacion = identificacion;
	}

	public int getIdGerente() {
		return this.idgerente;
	}

	public void setIdGerente(int idGerente) {
		this.idgerente = idGerente;
	}

	public int getIdJefe() {
		return this.idjefe;
	}

	public void setIdJefe(int idJefe) {
		this.idjefe = idJefe;
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
		return this.nombregerente;
	}

	public void setNombreGerente(String nombreGerente) {
		this.nombregerente = nombreGerente;
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
		return this.telfijo;
	}

	public void setTelFijo(BigDecimal telFijo) {
		this.telfijo = telFijo;
	}

	public BigDecimal getTelMovil() {
		return this.telmovil;
	}

	public void setTelMovil(BigDecimal telMovil) {
		this.telmovil = telMovil;
	}

	public BigDecimal getTelOtro() {
		return this.telotro;
	}

	public void setTelOtro(BigDecimal telOtro) {
		this.telotro = telOtro;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipoUsuario() {
		return this.tipousuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipousuario = tipoUsuario;
	}

	public Timestamp getUltimoIngreso() {
		return this.ultimoIngreso;
	}

	public void setUltimoIngreso(Timestamp ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}

	public int getUsuRepBaja() {
		return this.usurepbaja;
	}

	public void setUsuRepBaja(int usuRepBaja) {
		this.usurepbaja = usuRepBaja;
	}

	@ManyToOne(optional=false)
	@JoinColumn(name="fk_idrol", referencedColumnName="idrol")
	private Tblrol tblrol;
	
	public Tblrol getTblrol() {
		return this.tblrol;
	}

	public void setTblrol(Tblrol tblrol) {
	this.tblrol = tblrol;
	}
}