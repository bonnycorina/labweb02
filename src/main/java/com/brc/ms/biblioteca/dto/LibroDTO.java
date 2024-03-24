package com.brc.ms.biblioteca.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LibroDTO {
	 @NotBlank(message = "El título es obligatorio")
	 @Size(max = 100, message = "El título no puede tener más de 100 caracteres")
	 private String titulo;



}
