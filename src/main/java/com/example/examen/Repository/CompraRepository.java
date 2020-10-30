package com.example.examen.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.Compra;

@Repository("compraRepository")

public interface CompraRepository extends JpaRepository<Compra, Serializable>{

}
