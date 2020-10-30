package com.example.examen.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.Entity.TelefonoUsuario;
import com.example.examen.Repository.TelefonoUsuarioRepository;

@RestController
@RequestMapping("/telefonousuario")
@CrossOrigin 
public class TelefonoUsuarioService {
	@Autowired
	TelefonoUsuarioRepository telefonoUsuarioRepository;
	@GetMapping( path = "/buscar" )
	public List<TelefonoUsuario> getAllTelefonoUsuarios(){
		return telefonoUsuarioRepository.findAll();
	}
	@PostMapping( path = "/guardar")
	public TelefonoUsuario saveTelefonoUsuario(@RequestBody TelefonoUsuario telefonoUsuario) {
		return telefonoUsuarioRepository.save(telefonoUsuario);


	}
	@DeleteMapping (path = "/eliminar/{idtelefono_usuario}")
	public void deleteA (@PathVariable ("idtelefono_usuario")Integer idtelefono_usuario) {
		
		Optional<TelefonoUsuario> telefonousuario; 
		
		telefonousuario = telefonoUsuarioRepository.findById(idtelefono_usuario);
		
		if(telefonousuario.isPresent())
			telefonoUsuarioRepository.delete(telefonousuario.get());
	}
}
