package DAL.converters;

import DAL.dtos.RoleDTO;
import DAL.entities.Role;

public class RoleConverter extends AbstractConverter<Role, RoleDTO> {

    @Override
    public Role toEntity(RoleDTO dto) {
        return (dto.getId() == 0) ? new Role((long) 0, dto.getDescription())
                : new Role(dto.getId(), dto.getDescription());
    }

    @Override
    public RoleDTO toDTO(Role entity) {
        return new RoleDTO(entity.getId(), entity.getDescription());
    }

}
