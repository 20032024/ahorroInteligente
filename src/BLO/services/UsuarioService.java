package BLO.services;

import DAL.daos.impls.UsuarioDaoImpl;
import DAL.dtos.ProfesionDTO;
import DAL.dtos.UsuarioRegistroDTO;

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
            throw new CorreoRepetidoException("El correo ya está registrado.");
        }

        if (usuarioRegistroDTO.getEdad() < 10 || usuarioRegistroDTO.getEdad() > 100) {
            throw new EdadInvalidaException("La edad debe ser entre 18 y 100 años.");
        }

        for (ProfesionDTO profesion : usuarioRegistroDTO.getProfesiones()) {
            if (profesion.getMontoIngreso() < 0) {
                throw new MontoIngresoInvalidoException("El monto de ingreso no puede ser negativo.");
            }
        }

        // Si las validaciones son correctas, se agrega el usuario
        // Lógica de negocio (sin mensajes)
        return usuarioDAO.addUsuario(usuarioRegistroDTO);
    }


}
    

