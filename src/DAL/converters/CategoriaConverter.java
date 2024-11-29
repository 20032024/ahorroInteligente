package DAL.converters;

import DAL.dtos.CategoriaDTO;
import DAL.entities.Categoria_gasto;

public class CategoriaConverter extends AbstractConverter<Categoria_gasto, CategoriaDTO> {

    @Override
    public Categoria_gasto toEntity(CategoriaDTO dto) {
        if (dto == null) return null;

        Categoria_gasto entity = new Categoria_gasto();
        entity.setId_categoria(dto.getId());
        entity.setDescripcion(dto.getDescripcion());
        entity.setClaveCategoria(dto.getClave()); // Clave es String en ambas clases

        return entity;
    }

    @Override
    public CategoriaDTO toDTO(Categoria_gasto entity) {
        if (entity == null) return null;

        return new CategoriaDTO(
            entity.getId_categoria(),
            entity.getDescripcion(),
            entity.getClaveCategoria() // Clave es String en ambas clases
        );
    }
}

