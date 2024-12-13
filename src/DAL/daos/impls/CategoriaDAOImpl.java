package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.ICategoriaDAO;
import DAL.entities.Categoria_gasto;

public class CategoriaDAOImpl implements ICategoriaDAO {
    private Connection conn;

    public CategoriaDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
 @Override
    public Categoria_gasto getCategoriaById(int id) {
        Categoria_gasto categoria = null;
        String sql = "SELECT * FROM categoria_gasto WHERE id_categoria = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    categoria = new Categoria_gasto();
                    categoria.setId_categoria(rs.getInt("id_categoria"));
                    categoria.setDescripcion(rs.getString("descripcion"));
                    categoria.setClaveCategoria(rs.getString("claveCategoria"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoria;
    }

}
