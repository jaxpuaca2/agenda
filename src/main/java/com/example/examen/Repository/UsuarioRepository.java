package com.example.examen.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.Entity.Usuario;

@Repository("usuarioRepository")

public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{
	public List<Usuario> findByUsuarioAndPassword(String usuario, String password);
	//public List<Usuario> findByusuarioIdUsuario(Integer usuarioIdUsuario);

}
