package DAL.converters;

import DAL.dtos.LugarDTO;
import DAL.entities.Lugar;

public class LugarConverter extends AbstractConverter<Lugar, LugarDTO> {

    @Override
    public Lugar toEntity(LugarDTO dto) {
        if (dto == null) return null;

        Lugar entity = new Lugar();
        entity.setId_lugar(dto.getId());
        entity.setDescripcion(dto.getDescripcion());
        entity.setClave(dto.getClave());

        return entity;
    }

    @Override
    public LugarDTO toDTO(Lugar entity) {
        if (entity == null) return null;

        return new LugarDTO(
            entity.getId_lugar(),
            entity.getClave(),
            entity.getDescripcion()
        );
    }
}

