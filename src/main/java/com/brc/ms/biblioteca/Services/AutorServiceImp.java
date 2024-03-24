package com.brc.ms.biblioteca.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brc.ms.biblioteca.domain.Autor;
import com.brc.ms.biblioteca.repositories.AutorRepository;

@Service
public class AutorServiceImp implements AutorService{
	 @Autowired
	    private AutorRepository autorRepository;

	    @Override
	    public List<Autor> listarAutores() {
	        return autorRepository.findAll();
	    }

	    @Override
	    public Autor buscarAutorPorId(Long id) {
	        return autorRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Autor grabarAutor(Autor autor) {
	        return autorRepository.save(autor);
	    }

	    @Override
	    public void eliminarAutor(Long id) {
	        autorRepository.deleteById(id);
	    }

	    @Override
	    public Autor actualizarAutor(Long id, Autor autorActualizado) {
	        Autor autor = buscarAutorPorId(id);
	        if (autor != null) {
	            autor.setNombre(autorActualizado.getNombre());
	            autor.setApellido(autorActualizado.getApellido());
	            return autorRepository.save(autor);
	        }
	        return null;
	    }
}

