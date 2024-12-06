package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.ILugarDAO;
import DAL.entities.Lugar;

public class LugarDAOImpl implements ILugarDAO {
    private Connection conn;

    public LugarDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
 @Override
    public Lugar getLugarById(int id) {
        Lugar lugar = null;
        String sql = "SELECT * FROM lugar WHERE id_lugar = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    lugar = new Lugar();
                    lugar.setId_lugar(rs.getInt("id_lugar"));
                    lugar.setDescripcion(rs.getString("descripcion"));
                    lugar.setClave(rs.getString("clave"));
                    lugar.setLatitud(rs.getDouble("latitud"));
                    lugar.setLongitud(rs.getDouble("longitud"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lugar;
    }
}
