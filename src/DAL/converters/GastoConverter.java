package DAL.converters;

import BLO.services.CategoriaService;
import BLO.services.LugarService;
import BLO.services.TipoGastoService;
import DAL.dtos.GastoDTO;
import DAL.entities.Gasto;

public class GastoConverter extends AbstractConverter<Gasto, GastoDTO> {

    private LugarService lugarService = new LugarService();
    private CategoriaService categoriaService = new CategoriaService();
    private TipoGastoService tipoGastoService = new TipoGastoService();
    @Override
    public Gasto toEntity(GastoDTO dto) {
        if (dto == null) return null;

        Gasto entity = new Gasto();
        entity.setId_gasto(dto.getId_gasto());
        entity.setFecha(dto.getFecha());
        entity.setMonto(dto.getMonto());
        entity.setId_categoria(dto.getCategoria().getId());
        entity.setId_lugar(dto.getLugar().getId());
        return entity;
    }

    @Override
    public GastoDTO toDTO(Gasto entity) {
        if (entity == null) return null;

        var LugarDTO = lugarService.getLugarById(entity.getId_lugar());
        var CategoriaDTO = categoriaService.getCategoriaById(entity.getId_categoria());
        var tipoGasto = tipoGastoService.getTipoGastoById(entity.getId_tipo_gasto());
        return new GastoDTO(
            entity.getId_usuario(),
            entity.getMonto(),
            CategoriaDTO,
            LugarDTO,
            tipoGasto
        );
    }
}

