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

import com.example.examen.Entity.TelefonoCliente;
import com.example.examen.Repository.TelefonoClienteRepository;

@RestController
@RequestMapping("/telefonocliente")
@CrossOrigin
public class TelefonoClienteService {
	@Autowired
	TelefonoClienteRepository telefonoClienteRepository;
	@GetMapping( path = "/buscar" )
	public List<TelefonoCliente> getallClientes(){
		return telefonoClienteRepository.findAll();
	}

	@PostMapping( path = "/guardar")
	public TelefonoCliente saveTelefonoCliente(@RequestBody TelefonoCliente telefonoCliente) {
		return telefonoClienteRepository.save(telefonoCliente);


	}
	@DeleteMapping (path = "/eliminar/{idtelefono_cliente}")
	public void deleteA (@PathVariable ("idtelefono_cliente")Integer idtelefono_cliente) {
		
		Optional<TelefonoCliente> telefonocliente; 
		
		telefonocliente = telefonoClienteRepository.findById(idtelefono_cliente);
		
		if(telefonocliente.isPresent())
			telefonoClienteRepository.delete(telefonocliente.get());
	}
}
