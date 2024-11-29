package DAL.converters;

import DAL.entities.Usuario;
import DAL.dtos.UsuarioDTO;

public class UsuarioConverter extends AbstractConverter<Usuario, UsuarioDTO> {

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        if (dto == null) return null;

        Usuario usuario = new Usuario();
        usuario.setId_usuario(dto.getId_usuario());
        usuario.setNombre(dto.getNombre());
        usuario.setCorreo(dto.getCorreo());
        // No incluimos lista de gastos aquí porque no se pasa en UsuarioDTO
        return usuario;
    }

    @Override
    public UsuarioDTO toDTO(Usuario entity) {
        if (entity == null) return null;

        UsuarioDTO dto = new UsuarioDTO();
        dto.setId_usuario(entity.getId_usuario());
        dto.setNombre(entity.getNombre());
        dto.setCorreo(entity.getCorreo());
        dto.setGastos(null); // En este ejemplo dejamos vacía la lista de gastos
        return dto;
    }
}

