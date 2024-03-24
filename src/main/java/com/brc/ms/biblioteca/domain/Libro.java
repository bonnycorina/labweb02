package com.brc.ms.biblioteca.domain;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="idLibro")

public class Libro {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLibro;
	private String titulo;
	
	
	 @ManyToOne
	    @JoinColumn(name = "id_autor")
	    private Autor autor;
	
	 @ManyToMany
	    @JoinTable(
	        name = "libros_categorias",
	        joinColumns = @JoinColumn(name = "id_libro"),
	        inverseJoinColumns = @JoinColumn(name = "id_categoria")
	    )
	    private Set<Categoria> categorias;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@OneToOne(mappedBy = "libroSucesor")
	private Libro librosSucesores;

	@OneToOne
	@JoinColumn(name = "id_libro_sucesor")
	private Libro libroSucesor;

	public Object getAutor() {
		return null;
	}

	public Object getCategorias() {	
		return null;
	}

	public void setCategorias(Object categorias2) {
	
		
	}

	public void setAutor(Object autor2) {

		
	}
	

}
