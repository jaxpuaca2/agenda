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

import com.example.examen.Repository.AnuncioRepository;
import com.app.bitabyte.entity.Contacto;
import com.example.examen.Entity.Anuncio;


@RestController
@RequestMapping("/anuncio")
@CrossOrigin
public class AnuncioService {
	@Autowired
	AnuncioRepository anuncioRepository;
	@GetMapping( path = "/buscar" )
	public List<Anuncio> getAllAnuncios(){
		return anuncioRepository.findAll();
	}

	@PostMapping( path = "/guardar")
	public Anuncio saveAnuncio(@RequestBody Anuncio anuncio) {
		return anuncioRepository.save(anuncio);


	}
	@DeleteMapping (path = "/eliminar/{idanuncios}")
	public void deleteA (@PathVariable ("idanuncios")Integer idanuncios) {
		
		Optional<Anuncio> anuncios; 
		
		anuncios = anuncioRepository.findById(idanuncios);
		
		if(anuncios.isPresent())
			anuncioRepository.delete(anuncios.get());
	}
	@GetMapping(path = "/buscar/idanuncio/{idanuncio}")
	public Optional<Anuncio> findById(@PathVariable("idanuncio") Integer anuncio){
		return anuncioRepository.findById(anuncio);
	}
	}
	
