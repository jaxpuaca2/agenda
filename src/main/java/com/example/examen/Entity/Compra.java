package com.example.examen.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "compra")
public class Compra implements Serializable {
	
	private static final long serialVersionUID = 4L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="idcompra")
	private Integer idcompra;
	
	@Temporal(TemporalType.DATE)
	@Column(name ="fechacreacion")
	private Date fechacreacion;
	
	@Column(name ="total")
	private String total;
	
	@Column(name ="estado")
	private String estado;
	
	@Column(name ="direccion")
	private String direccion;
	
	@Column(name ="telefono")
	private String telefono;
	
	@Temporal(TemporalType.DATE)
	@Column(name ="fechaestado")
	private Date fechaestado;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name ="fechaentrega")
	private Date fechaentrega;


	public Integer getIdcompra() {
		return idcompra;
	}


	public void setIdcompra(Integer idcompra) {
		this.idcompra = idcompra;
	}


	public Date getFechacreacion() {
		return fechacreacion;
	}


	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Date getFechaestado() {
		return fechaestado;
	}


	public void setFechaestado(Date fechaestado) {
		this.fechaestado = fechaestado;
	}


	public Date getFechaentrega() {
		return fechaentrega;
	}


	public void setFechaentrega(Date fechaentrega) {
		this.fechaentrega = fechaentrega;
	}
	
	
}
