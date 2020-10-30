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
@Table(name= "detalle_compra")
public class DetalleCompra implements Serializable {
	
	private static final long serialVersionUID = 3L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name ="iddetalle_compra")
	private Integer iddetalleCompra;
	
	@Column(name ="cantidad")
	private Integer cantidad;
	
	@Column(name ="sub_total")
	private String subTotal;
	
	@Column(name ="compra_idcompra")
	private Integer compraIdcompra;
	
	@Column(name ="producto_idproducto")
	private Integer productoIdproducto;

	public Integer getIddetalleCompra() {
		return iddetalleCompra;
	}

	public void setIddetalleCompra(Integer iddetalleCompra) {
		this.iddetalleCompra = iddetalleCompra;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}

	public Integer getCompraIdcompra() {
		return compraIdcompra;
	}

	public void setCompraIdcompra(Integer compraIdcompra) {
		this.compraIdcompra = compraIdcompra;
	}

	public Integer getProductoIdproducto() {
		return productoIdproducto;
	}

	public void setProductoIdproducto(Integer productoIdproducto) {
		this.productoIdproducto = productoIdproducto;
	}


}
