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

import com.example.examen.Entity.DetalleCompra;
import com.example.examen.Repository.DetalleCompraRepository;
@RestController
@RequestMapping("/detallecompra")
@CrossOrigin
public class DetalleCompraService {
	@Autowired
	DetalleCompraRepository detalleCompraRepository;
	@GetMapping( path = "/buscar" )
	public List<DetalleCompra> getAlldeDetalleCompras(){
		return detalleCompraRepository.findAll();
	}

	@PostMapping( path = "/guardar")
	public DetalleCompra saDetalleCompra(@RequestBody DetalleCompra detalleCompra) {
		return detalleCompraRepository.save(detalleCompra);


	}
	@DeleteMapping (path = "/eliminar/{iddetalle_compra}")
	public void deleteA (@PathVariable ("iddetalle_compra")Integer iddetalle_compra) {
		
		Optional<DetalleCompra> detallecompra; 
		
		detallecompra = detalleCompraRepository.findById(iddetalle_compra);
		
		if(detallecompra.isPresent())
			detalleCompraRepository.delete(detallecompra.get());
	}
}
