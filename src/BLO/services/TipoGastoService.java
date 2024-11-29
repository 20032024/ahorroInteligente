package BLO.services;

import DAL.daos.impls.TipoGastoDAOImpl;

public class TipoGastoService {
    private TipoGastoDAOImpl tipoGastoDAO;

    public TipoGastoService() {
        this.tipoGastoDAO = new TipoGastoDAOImpl();
    }

    public String getTipoGastoById(int idTipoGasto) {
        var tipoGastoEntity = tipoGastoDAO.findById(idTipoGasto); // Busca el tipo de gasto por ID en la BD
        return tipoGastoEntity.getDescripcion(); // Retorna solo la descripción
    }
}

