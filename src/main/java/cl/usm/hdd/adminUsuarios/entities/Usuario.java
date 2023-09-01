package cl.usm.hdd.adminUsuarios.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Usuario {
    private String email;
    private String nombre;
    private String apellido;
    private String clave;
}
