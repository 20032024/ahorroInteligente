package DAL.daos.interfaces;

import DAL.entities.Categoria_gasto;

public interface ICategoriaDAO {
    Categoria_gasto getCategoriaById(int id);
}
