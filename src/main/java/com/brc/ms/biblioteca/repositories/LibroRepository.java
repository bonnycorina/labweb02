package com.brc.ms.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brc.ms.biblioteca.domain.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}
