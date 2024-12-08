package BLO.services;

import DAL.daos.impls.UsuarioDaoImpl;
import DAL.dtos.UsuarioDTO;
import DAL.dtos.UsuarioRegistroDTO;
import DAL.entities.Usuario;

public class UsuarioService {
    private UsuarioDaoImpl usuarioDAO;

    public UsuarioService() {
        this.usuarioDAO = new UsuarioDaoImpl();
    }

    public int autenticarUsuario(String correo, String contrasena) {
        return usuarioDAO.validarCredenciales(correo, contrasena);
    }

    public boolean registrarUsuario(UsuarioRegistroDTO usuarioRegistroDTO) {
        // Validaciones
        if (usuarioDAO.validarCorreoExistente(usuarioRegistroDTO.getCorreo())) {
            throw new RuntimeException("El correo ya está registrado.");
        }

        if (usuarioRegistroDTO.getEdad() < 10 || usuarioRegistroDTO.getEdad() > 100) {
            throw new RuntimeException("La edad debe ser entre 18 y 100 años.");
        }

    
        if (usuarioRegistroDTO.getMontoIngreso() < 0) {
            throw new RuntimeException("El monto de ingreso no puede ser negativo.");
        }
        
        // Si las validaciones son correctas, se agrega el usuario
        return usuarioDAO.addUsuario(usuarioRegistroDTO);
    }

    public UsuarioDTO getUsuarioPorId(int id) {
    // Obtener el usuario desde el DAO
    Usuario usuario = usuarioDAO.getUsuariosById(id);

    if (usuario == null) {
        throw new RuntimeException("Usuario no encontrado.");
    }

    // Mapear el Usuario a UsuarioDTO
    UsuarioDTO usuarioDTO = new UsuarioDTO();
    usuarioDTO.setId_usuario(usuario.getId_usuario());
    usuarioDTO.setNombre(usuario.getNombre());
    usuarioDTO.setCorreo(usuario.getCorreo());

    return usuarioDTO;
}

}
    

