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
	@Table(name= "direccion_cliente")
	public class DireccionCliente implements Serializable {
		
		private static final long serialVersionUID = 10L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Basic(optional = false)
		@Column(name ="iddireccion_cliente")
		private Integer iddireccionCliente;
		
		@Column(name ="direccion")
		private String direccion;
		
		@Column(name ="cliente_correo")
		private String clienteCorreo;

		public Integer getIddireccionCliente() {
			return iddireccionCliente;
		}

		public void setIddireccionCliente(Integer iddireccionCliente) {
			this.iddireccionCliente = iddireccionCliente;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getClienteCorreo() {
			return clienteCorreo;
		}

		public void setClienteCorreo(String clienteCorreo) {
			this.clienteCorreo = clienteCorreo;
		}

}
