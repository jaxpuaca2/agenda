package com.example.examen.Service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.Entity.DireccionUsuario;
import com.example.examen.Entity.TelefonoUsuario;
import com.example.examen.Entity.Usuario;
import com.example.examen.Repository.DireccionUsuarioRepository;
import com.example.examen.Repository.TelefonoUsuarioRepository;
import com.example.examen.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	DireccionUsuarioRepository direccionUsuarioRepository;
	
	@Autowired
	TelefonoUsuarioRepository telefonoUsuarioRepository;
	
	@GetMapping( path = "/buscar" )
	public List<Usuario> getAllusuUsuarios(){
		return usuarioRepository.findAll();
	}

	@PostMapping( path = "/guardar")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		List<DireccionUsuario> direcciones = usuario.getDireccionusuarioList();
		List<TelefonoUsuario> telefonos = usuario.getTelefonousuarioList();
		
		usuario.setDireccionusuarioList(null);
		usuario.setTelefonousuarioList(null);
		
		usuario = usuarioRepository.save(usuario);
		
		usuario.setTelefonousuarioList(new LinkedList<>());
		usuario.setDireccionusuarioList(new LinkedList<>());
		
		
		if(direcciones!=null) {
			for(DireccionUsuario d : direcciones) {
				d.setUsuarioIdUsuario(usuario.getIdusuario());
				direccionUsuarioRepository.save(d);
				usuario.getDireccionusuarioList().add(d);
			}
		}
		
		if(telefonos!=null) {
			for(TelefonoUsuario t : telefonos) {
				t.setUsuarioIdUsuario(usuario.getIdusuario());
				telefonoUsuarioRepository.save(t);
				usuario.getTelefonousuarioList().add(t);
			}
		}
			
		return usuarioRepository.save(usuario);


	}
	
	@PostMapping(path = "/login")
	public Usuario login(@RequestBody Usuario usuario) {
		
		List<Usuario> usuarios = usuarioRepository.findByUsuarioAndPassword(usuario.getUsuario(), usuario.getPassword());
		
		if(!usuarios.isEmpty()) {
			return usuarios.get(0);			
		}
		
		return null;
	}
	
}
