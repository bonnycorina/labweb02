package com.brc.ms.biblioteca.domain;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Prestamo {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "id_usuario")
	    private Usuario usuario;

	    @ManyToOne
	    @JoinColumn(name = "id_libro")
	    private Libro libro;

	    @Temporal(TemporalType.DATE)
		private LocalDate fechaPrestamo;
	    @Temporal(TemporalType.DATE)
	    private LocalDate fechaDevolucion;
		public Object getFechaDevolucion() {
			// TODO Auto-generated method stub
			return null;
		}
		public Object getFechaPrestamo() {
			// TODO Auto-generated method stub
			return null;
		}
		public void setFechaPrestamo(Object fechaPrestamo2) {
			// TODO Auto-generated method stub
			
		}
		public void setFechaDevolucion(Object fechaDevolucion2) {
			// TODO Auto-generated method stub
			
		}
		

	    // Getters y Setters
}
