package com.brc.ms.biblioteca.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brc.ms.biblioteca.domain.Libro;
import com.brc.ms.biblioteca.repositories.LibroRepository;

@Service
public class LibroServiceImp implements LibroService{
	 @Autowired
	    private LibroRepository libroRepository;

	    @Override
	    public List<Libro> listarLibros() {
	        return libroRepository.findAll();
	    }

	    @Override
	    public Libro buscarLibroPorId(Long id) {
	        return libroRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Libro grabarLibro(Libro libro) {
	        return libroRepository.save(libro);
	    }

	    @Override
	    public void eliminarLibro(Long id) {
	        libroRepository.deleteById(id);
	    }

	    @Override
	    public Libro actualizarLibro(Long id, Libro libroActualizado) {
	        Libro libro = buscarLibroPorId(id);
	        if (libro != null) {
	            libro.setTitulo(libroActualizado.getTitulo());
	            libro.setAutor(libroActualizado.getAutor());
	            libro.setCategorias(libroActualizado.getCategorias());
	            return libroRepository.save(libro);
	        }
	        return null;
	    }
	}