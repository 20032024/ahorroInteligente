package DAL.daos.interfaces;
import java.util.List;
import DAL.dtos.ComparativaCategoriaGastoDTO;

public interface IComparativaCategoriaGastoDAO {

    /**
     * Obtiene todas las comparativas de categoría de gasto.
     * @return Una lista de objetos ComparativaCategoriaGastoDTO
     */
    List<ComparativaCategoriaGastoDTO> getAllComparativas();

    /**
     * Obtiene una comparativa de categoría de gasto por su ID.
     * @param id El ID de la comparativa
     * @return Un objeto ComparativaCategoriaGastoDTO si se encuentra; null en caso contrario
     */
    ComparativaCategoriaGastoDTO getComparativaById(int id);

    /**
     * Inserta una nueva comparativa de categoría de gasto.
     * @param comparativa Un objeto ComparativaCategoriaGastoDTO que contiene los datos a insertar
     * @return true si la inserción fue exitosa, false en caso contrario
     */
    boolean addComparativa(ComparativaCategoriaGastoDTO comparativa);

    /**
     * Actualiza una comparativa de categoría de gasto existente.
     * @param comparativa Un objeto ComparativaCategoriaGastoDTO que contiene los datos actualizados
     * @return true si la actualización fue exitosa, false en caso contrario
     */
    boolean updateComparativa(ComparativaCategoriaGastoDTO comparativa);

    /**
     * Elimina una comparativa de categoría de gasto por su ID.
     * @param id El ID de la comparativa a eliminar
     * @return true si la eliminación fue exitosa, false en caso contrario
     */
    boolean deleteComparativa(int id);
}



