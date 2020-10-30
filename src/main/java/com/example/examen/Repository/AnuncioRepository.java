package com.example.examen.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.Anuncio;

@Repository("anuncioRepository")
public interface AnuncioRepository extends JpaRepository<Anuncio, Serializable>{


}
