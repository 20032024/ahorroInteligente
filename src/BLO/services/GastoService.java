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

    public String validarGasto(GastoDTO gastoDTO) {
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
        // Validar el gasto primero
        String error = validarGasto(gastoDTO);
        if (error != null) {
            System.out.println("Error al registrar gasto: " + error);
            return false;
        }

    // Usar el converter para convertir a entidad
    Gasto gasto = gastoConverter.toEntity(gastoDTO,idUsuario,gastoDTO.getCategoria(),gastoDTO.getTipoGasto(),gastoDTO.getLugar());

    // Usar el DAO para registrar el gasto
    if (gastoDAO.registrarGasto(gasto)) {
        System.out.println("Gasto agregado correctamente.");
    } else {
        System.out.println("Error al agregar el gasto.");
    }
       
    }

    /**
     * Simula la obtención de un ID para la categoría desde la base de datos.
     * En la implementación real, podrías usar un DAO o mapa estático.
     */
    private int obtenerIdCategoria(String categoria) {
        switch (categoria.toLowerCase()) {
            case "comida": return 1;
            case "salud": return 2;
            case "transporte": return 3;
            // Agrega las demás categorías aquí
            default: return -1; // Categoría inválida
        }
    }

    /**
     * Simula la obtención de un ID para el tipo de gasto.
     */
    private int obtenerIdTipoGasto(String tipoGasto) {
        switch (tipoGasto.toLowerCase()) {
            case "base": return 1;
            case "hormiga": return 2;
            default: return -1; // Tipo de gasto inválido
        }
    }

    /**
     * Simula la obtención de un ID para el lugar.
     */
    private int obtenerIdLugar(String lugar) {
        switch (lugar.toLowerCase()) {
            case "centro": return 1;
            case "norte": return 2;
            case "sur": return 3;
            default: return -1; // Lugar inválido
        }
    }
}

