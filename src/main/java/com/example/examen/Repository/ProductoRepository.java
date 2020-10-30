package com.example.examen.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.Producto;

@Repository("productoRepository")
public interface ProductoRepository  extends JpaRepository<Producto, Serializable>{

}
