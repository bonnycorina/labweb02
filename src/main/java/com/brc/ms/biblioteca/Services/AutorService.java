package com.brc.ms.biblioteca.Services;

import java.util.List;


import com.brc.ms.biblioteca.domain.Autor;


public interface AutorService {
    List<Autor> listarAutores();
    Autor buscarAutorPorId(Long id);
    Autor grabarAutor(Autor autor);
    void eliminarAutor(Long id);
    Autor actualizarAutor(Long id, Autor autorActualizado);
}