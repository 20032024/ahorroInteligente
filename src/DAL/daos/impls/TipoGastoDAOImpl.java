package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAL.daos.interfaces.ITipoGastoDAO;
import DAL.entities.Tipo_gasto;
import DAL.connection.PostgreSQL.PostgresDbConn;

public class TipoGastoDAOImpl implements ITipoGastoDAO {
    private Connection conn;

    public TipoGastoDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
    @Override
    public Tipo_gasto getTipoGastoById(int id) {
        Tipo_gasto tipoGasto = null;
        String sql = "SELECT * FROM tipo_gasto WHERE id_tipoGasto = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    tipoGasto = new Tipo_gasto();
                    tipoGasto.setId_tipoGasto(rs.getInt("id_tipoGasto"));
                    tipoGasto.setDescripcion(rs.getString("descripcion"));
                    tipoGasto.setClave_tipoGasto(rs.getInt("clave_tipoGasto"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoGasto;
    }
}
