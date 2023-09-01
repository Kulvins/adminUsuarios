package cl.usm.hdd.adminUsuarios.services;

import cl.usm.hdd.adminUsuarios.entities.Usuario;

import java.util.List;

public interface UsuariosService {
    List<Usuario> getAll();
    Usuario create(Usuario u);
    Usuario find(String email);
}
