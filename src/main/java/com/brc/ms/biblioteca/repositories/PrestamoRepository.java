package com.brc.ms.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brc.ms.biblioteca.domain.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
