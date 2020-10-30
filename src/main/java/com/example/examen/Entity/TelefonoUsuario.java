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
@Table(name= "telefono_usuario")
public class TelefonoUsuario implements Serializable {
	
	private static final long serialVersionUID = 8L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="idtelefono_usuario")
	private Integer idtelefonoUsuario;
	
	@Column(name ="telefono")
	private String telefono;
	//usuarioIdusuario
	@Column(name ="usuario_idusuario")
	private Integer usuarioIdUsuario;

	public Integer getIdtelefonoUsuario() {
		return idtelefonoUsuario;
	}

	public void setIdtelefonoUsuario(Integer idtelefonoUsuario) {
		this.idtelefonoUsuario = idtelefonoUsuario;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getUsuarioIdUsuario() {
		return usuarioIdUsuario;
	}

	public void setUsuarioIdUsuario(Integer usuarioIdUsuario) {
		this.usuarioIdUsuario = usuarioIdUsuario;
	}




}
