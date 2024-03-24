package com.brc.ms.biblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.brc.ms.biblioteca.domain.Prestamo;
import com.brc.ms.biblioteca.repositories.PrestamoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @GetMapping
    public List<Prestamo> getAllPrestamos() {
        return prestamoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Prestamo getPrestamoById(@PathVariable Long id) {
        return prestamoRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Prestamo createPrestamo(@RequestBody Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @PutMapping("/{id}")
    public Prestamo updatePrestamo(@PathVariable Long id, @RequestBody Prestamo prestamoDetails) {
        Prestamo prestamo = prestamoRepository.findById(id).orElse(null);
        if (prestamo != null) {
            prestamo.setFechaPrestamo(prestamoDetails.getFechaPrestamo());
            prestamo.setFechaDevolucion(prestamoDetails.getFechaDevolucion());
            return prestamoRepository.save(prestamo);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deletePrestamo(@PathVariable Long id) {
        prestamoRepository.deleteById(id);
    }
}
