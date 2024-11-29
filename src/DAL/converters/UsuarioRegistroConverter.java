package DAL.converters;

import DAL.entities.Usuario;
import DAL.dtos.UsuarioRegistroDTO;

public class UsuarioRegistroConverter extends AbstractConverter<Usuario, UsuarioRegistroDTO> {

    @Override
    public Usuario toEntity(UsuarioRegistroDTO dto) {
        if (dto == null) return null;

        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setApPaterno(dto.getApPaterno());
        usuario.setApMaterno(dto.getApMaterno());
        usuario.setEdad(dto.getEdad());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContraseña(dto.getContraseña());
        usuario.setFecha_registro(dto.getFecha_registro());
        return usuario;
    }

    @Override
    public UsuarioRegistroDTO toDTO(Usuario entity) {
        if (entity == null) return null;

        UsuarioRegistroDTO dto = new UsuarioRegistroDTO();
        dto.setNombre(entity.getNombre());
        dto.setApPaterno(entity.getApPaterno());
        dto.setApMaterno(entity.getApMaterno());
        dto.setEdad(entity.getEdad());
        dto.setCorreo(entity.getCorreo());
        dto.setContraseña(entity.getContraseña());
        dto.setFecha_registro(entity.getFecha_registro());
        return dto;
    }
}

