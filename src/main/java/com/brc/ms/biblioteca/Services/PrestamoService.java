package com.brc.ms.biblioteca.Services;

import java.util.List;



import com.brc.ms.biblioteca.domain.Prestamo;


public interface PrestamoService {
    List<Prestamo> listarPrestamos();
    Prestamo buscarPrestamoPorId(Long id);
    Prestamo grabarPrestamo(Prestamo prestamo);
    void eliminarPrestamo(Long id);
    Prestamo actualizarPrestamo(Long id, Prestamo prestamoActualizado);
}