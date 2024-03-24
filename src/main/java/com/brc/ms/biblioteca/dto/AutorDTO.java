package com.brc.ms.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AutorDTO {
	@NotBlank(message = "El nombre es obligatorio")
	@Size(max = 50, message = "El nombre no puede tener más de 50 caracteres")
	private String nombre;

	@NotBlank(message = "El apellido es obligatorio")
	@Size(max = 50, message = "El apellido no puede tener más de 50 caracteres")
	private String apellido;
}
