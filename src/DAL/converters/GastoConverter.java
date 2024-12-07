package DAL.converters;

import DAL.dtos.GastoDTO;
import DAL.entities.Gasto;

public class GastoConverter {

    public Gasto toEntity(GastoDTO dto, int idUsuario, int idCategoria, int idTipoGasto, int idLugar) {
        Gasto gasto = new Gasto();
        gasto.setId_usuario(idUsuario); // Asociamos el usuario
        gasto.setMonto(dto.getMonto());
        gasto.setFecha(dto.getFecha()); // Convertimos String a Date
        gasto.setId_categoria(idCategoria);
        gasto.setId_tipoGasto(idTipoGasto);
        gasto.setId_lugar(idLugar);
        gasto.setMetodo_pago("Efectivo");
        // Puedes agregar más atributos si es necesario
        return gasto;
    }

    public GastoDTO toDTO(Gasto entity, String tipoGasto, String categoria, String lugar) {
        return new GastoDTO(
            tipoGasto,
            entity.getMonto(),
            categoria,
            lugar,
            entity.getFecha(),
            entity.getId_usuario()
        );
    }
}

/**package DAL.converters;

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
        var tipoGasto = tipoGastoService.getTipoGastoById(entity.getId_tipoGasto());
        return new GastoDTO(
            entity.getId_usuario(),
            entity.getMonto(),
            CategoriaDTO,
            LugarDTO,
            tipoGasto
        );
    }
}*/

