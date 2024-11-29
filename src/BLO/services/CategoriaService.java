package BLO.services;

import DAL.converters.CategoriaConverter;
import DAL.daos.impls.CategoriaDAOImpl;
import DAL.dtos.CategoriaDTO;

public class CategoriaService {
    private CategoriaDAOImpl categoriaDAO;

    public CategoriaService() {
        this.categoriaDAO = new CategoriaDAOImpl();
    }

    public CategoriaDTO getCategoriaById(int idCategoria) {
        var categoriaEntity = categoriaDAO.findById(idCategoria); // Busca la categoría por ID en la BD
        return new CategoriaConverter().toDTO(categoriaEntity); // Convierte la entidad a DTO
    }
}

