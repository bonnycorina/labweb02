package com.brc.ms.biblioteca.Services;

import java.util.List;


import com.brc.ms.biblioteca.domain.Libro;


public interface LibroService {
    List<Libro> listarLibros();
    Libro buscarLibroPorId(Long id);
    Libro grabarLibro(Libro libro);
    void eliminarLibro(Long id);
    Libro actualizarLibro(Long id, Libro libroActualizado);
}