package com.brc.ms.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.brc.ms.biblioteca.domain.Autor;


public interface AutorRepository extends JpaRepository<Autor, Long> {

}
