package com.example.examen.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.DireccionUsuario;

@Repository("direccionUsuarioRepository")

public interface DireccionUsuarioRepository extends JpaRepository<DireccionUsuario, Serializable>{

}
