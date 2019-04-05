package com.ensat.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@NamedQueries({
		@NamedQuery(name="Tblusuario.findOne", query="FROM Tblusuario U inner join fetch U.tblrol inner join fetch U.tblcargo where U.codigoUsuario = :codigo_usuario")
	   ,@NamedQuery(name="Tblusuario.findByLoginAndPassword", query="FROM Tblusuario U inner join fetch U.tblcargo where U.nick = :nick")
})
public class Tblusuario implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "codigo_usuario")
	private Long codigoUsuario;

	private String apellidos;

	@Lob
	private byte[] clavesegura;

	@Column(name = "contador_visitas", nullable = true)
	private Integer contadorVisitas;

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

	private BigDecimal identificacion;

	private int idgerente;

	private int idjefe;

	private String imagen;

	private String nick;

	private String nombregerente;

	private String nombres;

	private String skype;

	@Column(name = "sueldo_costo")
	private int sueldoCosto;

	private BigDecimal telfijo;

	private BigDecimal telmovil;

	private BigDecimal telotro;

	private String tipo;

	private String tipousuario;

	@Column(name = "ultimo_ingreso")
	private Timestamp ultimoIngreso;

	private Integer usurepbaja;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "idcargo")
	private Tblcargo tblcargo;

	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_idrol", referencedColumnName = "idrol")
	private Tblrol tblrol;

	public Tblusuario() {
	}

	public Long getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Long codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public byte[] getClavesegura() {
		return clavesegura;
	}

	public void setClavesegura(byte[] clavesegura) {
		this.clavesegura = clavesegura;
	}

	public Integer getContadorVisitas() {
		return contadorVisitas;
	}

	public void setContadorVisitas(Integer contadorVisitas) {
		this.contadorVisitas = contadorVisitas;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCorreo2() {
		return correo2;
	}

	public void setCorreo2(String correo2) {
		this.correo2 = correo2;
	}

	public String getCorreo3() {
		return correo3;
	}

	public void setCorreo3(String correo3) {
		this.correo3 = correo3;
	}

	public String getDescripcionbaja() {
		return descripcionbaja;
	}

	public void setDescripcionbaja(String descripcionbaja) {
		this.descripcionbaja = descripcionbaja;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Timestamp getFecha_Registro() {
		return fecha_Registro;
	}

	public void setFecha_Registro(Timestamp fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}

	public Timestamp getFechabaja() {
		return fechabaja;
	}

	public void setFechabaja(Timestamp fechabaja) {
		this.fechabaja = fechabaja;
	}

	public Date getFechacumpleanios() {
		return fechacumpleanios;
	}

	public void setFechacumpleanios(Date fechacumpleanios) {
		this.fechacumpleanios = fechacumpleanios;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public BigDecimal getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(BigDecimal identificacion) {
		this.identificacion = identificacion;
	}

	public int getIdgerente() {
		return idgerente;
	}

	public void setIdgerente(int idgerente) {
		this.idgerente = idgerente;
	}

	public int getIdjefe() {
		return idjefe;
	}

	public void setIdjefe(int idjefe) {
		this.idjefe = idjefe;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombregerente() {
		return nombregerente;
	}

	public void setNombregerente(String nombregerente) {
		this.nombregerente = nombregerente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public int getSueldoCosto() {
		return sueldoCosto;
	}

	public void setSueldoCosto(int sueldoCosto) {
		this.sueldoCosto = sueldoCosto;
	}

	public BigDecimal getTelfijo() {
		return telfijo;
	}

	public void setTelfijo(BigDecimal telfijo) {
		this.telfijo = telfijo;
	}

	public BigDecimal getTelmovil() {
		return telmovil;
	}

	public void setTelmovil(BigDecimal telmovil) {
		this.telmovil = telmovil;
	}

	public BigDecimal getTelotro() {
		return telotro;
	}

	public void setTelotro(BigDecimal telotro) {
		this.telotro = telotro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipousuario() {
		return tipousuario;
	}

	public void setTipousuario(String tipousuario) {
		this.tipousuario = tipousuario;
	}

	public Timestamp getUltimoIngreso() {
		return ultimoIngreso;
	}

	public void setUltimoIngreso(Timestamp ultimoIngreso) {
		this.ultimoIngreso = ultimoIngreso;
	}

	public Integer getUsurepbaja() {
		return usurepbaja;
	}

	public void setUsurepbaja(Integer usurepbaja) {
		this.usurepbaja = usurepbaja;
	}

	public Tblcargo getCargo() {
		return tblcargo;
	}

	public void setCargo(Tblcargo tblcargo) {
		this.tblcargo = tblcargo;
	}

	public Tblrol getTblrol() {
		return tblrol;
	}

	public void setTblrol(Tblrol tblrol) {
		this.tblrol = tblrol;
	}

}