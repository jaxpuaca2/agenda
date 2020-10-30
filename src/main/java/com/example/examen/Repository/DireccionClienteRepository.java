package com.example.examen.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.DireccionCliente;

@Repository("direccionclienteRepository")

public interface DireccionClienteRepository extends JpaRepository<DireccionCliente, Serializable>{

}
