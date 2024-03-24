package com.brc.ms.biblioteca.Services;

import java.util.List;


import com.brc.ms.biblioteca.domain.Categoria;


public interface CategoriaService {
    List<Categoria> listarCategorias();
    Categoria buscarCategoriaPorId(Long id);
    Categoria grabarCategoria(Categoria categoria);
    void eliminarCategoria(Long id);
    Categoria actualizarCategoria(Long id, Categoria categoriaActualizada);
}
