package cl.usm.hdd.adminUsuarios.services;

import cl.usm.hdd.adminUsuarios.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuariosServiceImpl implements UsuariosService{

    private static List<Usuario> usuarios = new ArrayList<>();
    @Override
    public List<Usuario> getAll() {
        return usuarios;
    }

    @Override
    public Usuario create(Usuario u) {
        usuarios.add(u);
        return u;
    }

    @Override
    public Usuario find(String email) {
        return usuarios.stream().filter((aux)->aux.getEmail().equalsIgnoreCase(email)).findFirst().orElse(null);
    }
}
