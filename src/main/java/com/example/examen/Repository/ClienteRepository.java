package com.example.examen.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.Cliente;

@Repository("clienteRepository")

public interface ClienteRepository extends JpaRepository<Cliente, Serializable>{

}
