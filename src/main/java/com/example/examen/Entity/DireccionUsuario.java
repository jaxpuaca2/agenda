package com.example.examen.Entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "direccion_usuario")
public class DireccionUsuario implements Serializable {
	
	private static final long serialVersionUID = 6L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="iddireccion")
	private Integer iddireccion;
	
	@Column(name ="direccion")
	private String direccion;

	@Column(name ="usuario_idusuario")
	private Integer usuarioIdusuario;

	public Integer getUsuarioIdUsuario() {
		return usuarioIdusuario;
	}

	public void setUsuarioIdUsuario(Integer usuarioIdUsuario) {
		this.usuarioIdusuario = usuarioIdUsuario;
	}

	

	public Integer getIddireccion() {
		return iddireccion;
	}

	public void setIddireccion(Integer iddireccion) {
		this.iddireccion = iddireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
