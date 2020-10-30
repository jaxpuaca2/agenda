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

import com.example.examen.Entity.Cliente;
import com.example.examen.Entity.DireccionCliente;
import com.example.examen.Entity.TelefonoCliente;
import com.example.examen.Repository.ClienteRepository;
import com.example.examen.Repository.DireccionClienteRepository;
import com.example.examen.Repository.TelefonoClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	DireccionClienteRepository direccionclienteRepository;
	
	@Autowired
	TelefonoClienteRepository telefonoclienteRepository;
	
	@GetMapping( path = "/buscar" )
	public List<Cliente> getAllclClientes(){
		return clienteRepository.findAll();
	}

	@PostMapping( path = "/guardar")
	public Cliente saveCliente(@RequestBody Cliente cliente) {
		List<TelefonoCliente> telefonos = cliente.getTelefonoclienteList();
		List<DireccionCliente> direcciones = cliente.getDireccionclienteList();
		
		cliente.setTelefonoclienteList(null);
		cliente.setDireccionclienteList(null);
		
		cliente= clienteRepository.save(cliente);
		
		cliente.setTelefonoclienteList(new LinkedList<>());
		cliente.setDireccionclienteList(new LinkedList<>());
		
		
		if(direcciones!=null) {
			for(DireccionCliente d : direcciones) {
				d.setClienteCorreo(cliente.getCorreo());
				direccionclienteRepository.save(d);
				cliente.getDireccionclienteList().add(d);
			}
		}
		
		if(telefonos!=null) {
			for(TelefonoCliente t : telefonos) {
				t.setClienteCorreo(cliente.getCorreo());
				telefonoclienteRepository.save(t);
				cliente.getTelefonoclienteList().add(t);
			}
		}
		
		
		
		return clienteRepository.save(cliente);


	}
}
	
