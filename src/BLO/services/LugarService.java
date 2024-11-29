package BLO.services;

import DAL.converters.LugarConverter;
import DAL.daos.impls.LugarDAOImpl;
import DAL.dtos.LugarDTO;

public class LugarService {
    private LugarDAOImpl lugarDAO;

    public LugarService() {
        this.lugarDAO = new LugarDAOImpl();
    }

    public LugarDTO getLugarById(int idLugar) {
        var lugarEntity = lugarDAO.findById(idLugar); // Busca el lugar por ID en la BD
        return new LugarConverter().toDTO(lugarEntity); // Convierte la entidad a DTO
    }
}

