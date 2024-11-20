package DAL.converters;

import java.util.stream.Collectors;

import DAL.dtos.UserDTO;
import DAL.entities.Role;
import DAL.entities.User;

public class UserConverter extends AbstractConverter<User, UserDTO> {

    @Override
    public User toEntity(UserDTO dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setUserName(dto.getUserName());
        user.setPass(dto.getPass());
        // Prevent Null Exception
        if (dto.getRoles() != null) {

            user.setRoles(dto.getRoles().stream()
                    .map(rol -> Role.valueOf(rol)).collect(Collectors.toList()));
        }
        return user;
    }

    @Override
    public UserDTO toDTO(User entity) {
        UserDTO user = new UserDTO();
        user.setId(entity.getId());
        user.setUserName(entity.getUserName());
        user.setPass(entity.getPass());

        // Prevent Null Exception
        if (entity.getRoles() != null) {
            user.setRoles(entity.getRoles().stream()
                    .map(rol -> rol.getDescription()).collect(Collectors.toList()));
        }
        return user;
    }
}