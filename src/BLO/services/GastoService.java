package BLO.services;

import DAL.daos.interfaces.IGastoDAO;
import DAL.converters.GastoConverter;
import DAL.dtos.GastoDTO;
import DAL.entities.Gasto;

public class GastoService {

    private IGastoDAO gastoDAO;
    private GastoConverter gastoConverter;

    // Constructor para inyectar dependencias
    public GastoService(IGastoDAO gastoDAO, GastoConverter gastoConverter) {
        this.gastoDAO = gastoDAO;
        this.gastoConverter = gastoConverter;
    }

    public String validarGasto(GastoDTO gastoDTO) {//esto mejor lo manejamos desde el gui 
        if (gastoDTO.getMonto() <= 0) {
            return "El monto debe ser mayor a 0.";
        }
        /**if (gastoDTO.getMetodoPago() != null &&
            !gastoDTO.getMetodoPago().equalsIgnoreCase("Efectivo") && 
            !gastoDTO.getMetodoPago().equalsIgnoreCase("Tarjeta")) {
            return "El método de pago debe ser 'Efectivo' o 'Tarjeta'.";
        }*/
        if (gastoDTO.getCategoria() == null || gastoDTO.getCategoria().isEmpty()) {
            return "La categoría no puede estar vacía.";
        }
        if (gastoDTO.getLugar() == null || gastoDTO.getLugar().isEmpty()) {
            return "El lugar no puede estar vacío.";
        }
        return null; // Todo está correcto
    }

    public boolean registrarGasto(GastoDTO gastoDTO, int idUsuario) {
        boolean exito = false; 

    // Usar el converter para convertir a entidad
    Gasto gasto = gastoConverter.toEntity(
        gastoDTO,
        idUsuario,
        gastoDTO.getId_categoria(),
        gastoDTO.getId_tipoGasto(),
        gastoDTO.getId_lugar());

    // Usar el DAO para registrar el gasto
    if (gastoDAO.registrarGasto(gasto)) {
        exito = true; 
    } 
    return exito;   
    }
}

