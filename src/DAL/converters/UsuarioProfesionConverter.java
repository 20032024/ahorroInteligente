package DAL.converters;

import DAL.dtos.UsuarioProfesionDTO;
import DAL.entities.Usuario;
import DAL.entities.Usuario_profesion;
import DAL.entities.Profesion;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioProfesionConverter {

    public UsuarioProfesionDTO toDto(Usuario usuario, List<Usuario_profesion> usuarioProfesiones, List<Profesion> profesiones) {
        // Combinar nombre completo
        String nombreCompleto = usuario.getNombre() + " " + usuario.getApPaterno() + " " + usuario.getApMaterno();

        // Crear la lista de profesiones con sus ingresos
        List<UsuarioProfesionDTO.ProfesionIngreso> profesionesList = usuarioProfesiones.stream().map(up -> {
            // Buscar la descripción de la profesión correspondiente
            Profesion profesion = profesiones.stream()
                    .filter(p -> p.getId_profesion() == up.getId_profesion())
                    .findFirst()
                    .orElse(null);

            // Verificar si se encontró la profesión
            String descripcion = (profesion != null) ? profesion.getDescripcion() : "Profesión no encontrada";

            // Crear el objeto ProfesionIngreso
            return new UsuarioProfesionDTO.ProfesionIngreso(descripcion, up.getMonto_ingreso());
        }).collect(Collectors.toList());

        // Crear y retornar el DTO
        return new UsuarioProfesionDTO(nombreCompleto, profesionesList);
    }
}

