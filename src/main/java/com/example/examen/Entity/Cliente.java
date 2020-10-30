package com.example.examen.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 5L; 
		
	@Id
	@Basic(optional = false)
	@Column(name ="correo")
	private String correo;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="nit")
	private String nit;
	
	
	@OneToMany(mappedBy = "clienteCorreo" )
	private List<TelefonoCliente> telefonoclienteList;
	
	@OneToMany(mappedBy = "clienteCorreo" )
	private List<DireccionCliente> direccionclienteList;

	public List<TelefonoCliente> getTelefonoclienteList() {
		return telefonoclienteList;
	}

	public void setTelefonoclienteList(List<TelefonoCliente> telefonoclienteList) {
		this.telefonoclienteList = telefonoclienteList;
	}

	public List<DireccionCliente> getDireccionclienteList() {
		return direccionclienteList;
	}

	public void setDireccionclienteList(List<DireccionCliente> direccionclienteList) {
		this.direccionclienteList = direccionclienteList;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}
	
}
