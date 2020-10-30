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

import com.example.examen.Entity.Compra;
import com.example.examen.Repository.CompraRepository;

@RestController
@RequestMapping("/compra")
@CrossOrigin
public class CompraService {
	@Autowired
	CompraRepository compraRepository;
	@GetMapping( path = "/buscar" )
	public List<Compra> getAllCompras(){
		return compraRepository.findAll();
	}

	@PostMapping( path = "/guardar")
	public Compra saveCompra(@RequestBody Compra compra) {
		return compraRepository.save(compra);


	}
	@DeleteMapping (path = "/eliminar/{idcompra}")
	public void deleteA (@PathVariable ("idcompra")Integer idcompra) {
		
		Optional<Compra> compras; 
		
		compras = compraRepository.findById(idcompra);
		
		if(compras.isPresent())
			compraRepository.delete(compras.get());
	}
}
