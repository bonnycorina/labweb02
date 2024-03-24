package com.brc.ms.biblioteca.Services;

import java.util.List;


import com.brc.ms.biblioteca.domain.Usuario;


public interface UsuarioService {
    List<Usuario> listarUsuarios();
    Usuario buscarUsuarioPorId(Long id);
    Usuario grabarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
    Usuario actualizarUsuario(Long id, Usuario usuarioActualizado);
}
