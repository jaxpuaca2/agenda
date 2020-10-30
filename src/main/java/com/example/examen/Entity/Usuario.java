package com.example.examen.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name= "usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 9L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="idusuario")
	private Integer idusuario;
	
	@Column(name ="usuario")
	private String usuario;
	
	@Column(name ="password")
	private String password;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="apellido")
	private String apellido;
	


	

	@OneToMany(mappedBy = "usuarioIdUsuario" )
	private List<TelefonoUsuario> telefonousuarioList;
	
	@OneToMany(mappedBy = "usuarioIdusuario" )
	private List<DireccionUsuario> direccionusuarioList;
	
	
	

	public List<TelefonoUsuario> getTelefonousuarioList() {
		return telefonousuarioList;
	}

	public void setTelefonousuarioList(List<TelefonoUsuario> telefonousuarioList) {
		this.telefonousuarioList = telefonousuarioList;
	}

	public List<DireccionUsuario> getDireccionusuarioList() {
		return direccionusuarioList;
	}

	public void setDireccionusuarioList(List<DireccionUsuario> direccionusuarioList) {
		this.direccionusuarioList = direccionusuarioList;
	}

	public Integer getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	}
