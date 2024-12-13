package DAL.daos.impls;

import DAL.daos.interfaces.IUsuarioProfesionesDAO;
import DAL.entities.Profesion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DAL.connection.PostgreSQL.PostgresDbConn;

public class UsuarioProfesionesDAOImpl implements IUsuarioProfesionesDAO {
    private Connection conn;

    public UsuarioProfesionesDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
    @Override
    public List<Profesion> getProfesionesUsuario(int idUsuario) {
        List<Profesion> profesiones = new ArrayList<>();
        try (PreparedStatement stmt = conn.prepareStatement(
                "SELECT p.descripcion, up.id_tipoIngreso, up.monto_ingreso " +
                "FROM Profesiones p " +
                "INNER JOIN Usuario_profesiones up ON p.id_profesion = up.id_profesion " +
                "WHERE up.id_usuario = ?")) {
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Profesion profesion = new Profesion();
                profesion.setDescripcion(rs.getString("descripcion"));
                // Aquí podrías agregar los campos de tipoIngreso y monto si lo necesitas
                profesiones.add(profesion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return profesiones;
    }

    @Override
    public boolean addProfesion(int idUsuario, int idProfesion, int idTipoIngreso, float montoIngreso) {
        try (PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO Usuario_profesiones (id_usuario, id_profesion, id_tipoIngreso, monto_ingreso) VALUES (?, ?, ?, ?)")) {
            stmt.setInt(1, idUsuario);
            stmt.setInt(2, idProfesion);
            stmt.setInt(3, idTipoIngreso);
            stmt.setFloat(4, montoIngreso);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteProfesion(int idUsuario, int idProfesion) {
        try (PreparedStatement stmt = conn.prepareStatement(
                "DELETE FROM Usuario_profesiones WHERE id_usuario = ? AND id_profesion = ?")) {
            stmt.setInt(1, idUsuario);
            stmt.setInt(2, idProfesion);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

