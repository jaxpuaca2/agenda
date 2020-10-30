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
@Table(name= "telefono_cliente")
public class TelefonoCliente implements Serializable {
	
	private static final long serialVersionUID = 6L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="idtelefono_cliente")
	private Integer idtelefonoCliente;

	@Column(name ="telefono")
	private String telefono;
	
	@Column(name ="cliente_correo")
	private String clienteCorreo;
	

	public Integer getIdtelefonoCliente() {
		return idtelefonoCliente;
	}

	public void setIdtelefonoCliente(Integer idtelefonoCliente) {
		this.idtelefonoCliente = idtelefonoCliente;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getClienteCorreo() {
		return clienteCorreo;
	}

	public void setClienteCorreo(String clienteCorreo) {
		this.clienteCorreo = clienteCorreo;
	}

}
