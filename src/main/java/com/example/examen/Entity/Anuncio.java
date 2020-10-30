package com.example.examen.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name= "anuncio")
public class Anuncio implements Serializable{

	private static final long serialVersionUID = 1L; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="idanuncio")
	private Integer idanuncio;
	
	@Lob
	@Column(name = "texto")
	private String texto;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fechainicio")
	private Date fechainicio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fechafinal")
	private Date fechafinal;
	
	@Lob
	@Column(name = "imagen")
	private String imagen;
	
	public Date getFechafinal() {
		return fechafinal;
	}
	public void setFechafinal(Date fechafinal) {
		this.fechafinal = fechafinal;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Date getFechainicio() {
		return fechainicio;
	}
	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Integer getIdanuncio() {
		return idanuncio;
	}
	public void setIdanuncio(Integer idanuncio) {
		this.idanuncio = idanuncio;
	}

	

}
