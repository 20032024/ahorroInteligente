package DAL.converters;

import java.util.stream.Collectors;

import DAL.dtos.UsuarioDTO;
import DAL.entities.Role;
import DAL.entities.Usuarios;

public class UsuarioConverter extends AbstractConverter<Usuarios, UsuarioDTO> {

    @Override
    public Usuarios toEntity(UsuarioDTO dto) {
        Usuarios user = new Usuarios();
        user.setId(dto.getId());
        // Prevent Null Exception
        if (dto.getRoles() != null) {

            user.setRoles(dto.getRoles().stream()
                    .map(rol -> Role.valueOf(rol)).collect(Collectors.toList()));
        }
        return user;
    }

    @Override
    public UsuarioDTO toDTO(Usuarios entity) {
        UsuarioDTO user = new UsuarioDTO();
        user.setId(entity.getId());
        //user.setUserName(entity.getUserName());
        //user.setPass(entity.getPass());

        // Prevent Null Exception
        if (entity.getRoles() != null) {
            user.setRoles(entity.getRoles().stream()
                    .map(rol -> rol.getDescription()).collect(Collectors.toList()));
        }
        return user;
    }
}