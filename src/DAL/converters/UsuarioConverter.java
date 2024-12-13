package DAL.converters;

import DAL.entities.Usuario;
import java.util.List;
import DAL.dtos.GastoDTO;
import DAL.dtos.UsuarioDTO;
import DAL.dtos.UsuarioRegistroDTO;
import DAL.dtos.UsuarioGastosDTO;

public class UsuarioConverter extends AbstractConverter<Usuario, UsuarioDTO> {

    @Override
    public Usuario toEntity(UsuarioDTO dto) {
        if (dto == null) return null;
        Usuario usuario = new Usuario();
        usuario.setId_usuario(dto.getId_usuario());
        usuario.setNombre(dto.getNombre());
        usuario.setCorreo(dto.getCorreo());
        return usuario;
    }

    @Override
    public UsuarioDTO toDTO(Usuario entity) {
        if (entity == null) return null;
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId_usuario(entity.getId_usuario());
        dto.setNombre(entity.getNombre());
        dto.setCorreo(entity.getCorreo());
        return dto;
    }

// 3. UsuarioRegistro: toEntity
    public Usuario toEntity(UsuarioRegistroDTO dto) {
        if (dto == null) return null;
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setApPaterno(dto.getApPaterno());
        usuario.setApMaterno(dto.getApMaterno());
        usuario.setEdad(dto.getEdad());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContraseña(dto.getContraseña());
        usuario.setFechaRegistro(dto.getFechaRegistro());
        return usuario;
    }

    // 4. UsuarioRegistro: toDTO
    public UsuarioRegistroDTO toRegistroDTO(Usuario entity) {
        if (entity == null) return null;
        UsuarioRegistroDTO dto = new UsuarioRegistroDTO();
        dto.setNombre(entity.getNombre());
        dto.setApPaterno(entity.getApPaterno());
        dto.setApMaterno(entity.getApMaterno());
        dto.setEdad(entity.getEdad());
        dto.setCorreo(entity.getCorreo());
        dto.setContraseña(entity.getContraseña());
        dto.setFechaRegistro(entity.getFechaRegistro());
        return dto;
    }

    // 5. UsuarioGastos: toDTO
    public UsuarioGastosDTO toDTO(Usuario entity, List<GastoDTO> gastos) {
        if (entity == null) return null;
        UsuarioGastosDTO dto = new UsuarioGastosDTO(
            entity.getId_usuario(),
            entity.getNombre(),
            entity.getCorreo(),
            entity.getEdad(),
            gastos // Pasamos la lista de gastos obtenida desde la base de datos
        );
        return dto;
    }
}