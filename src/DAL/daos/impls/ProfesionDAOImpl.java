package DAL.daos.impls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.entities.Profesiones;
import DAL.daos.interfaces.IProfesionDAO;


public class ProfesionDAOImpl implements IProfesionDAO {
    private Connection conn;

    public ProfesionDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }

    @Override
    public List<Profesiones> getProfesiones() {
        List<Profesiones> profesiones = new ArrayList<>();
        String sql = "SELECT * FROM profesiones";

        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Profesiones profesion = new Profesiones();
                profesion.setId_profesion(rs.getInt("id_profesion"));
                profesion.setDescripcion(rs.getString("descripcion"));
                profesiones.add(profesion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return profesiones;
    }

    @Override
    public Profesiones getProfesionesById(int id_profesion) {
        Profesiones profesion = null;
        String sql = "SELECT * FROM profesiones WHERE id_profesion = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id_profesion);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                profesion = new Profesiones();
                profesion.setId_profesion(rs.getInt("id_profesion"));
                profesion.setDescripcion(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return profesion;
    }

    @Override
    public void updateProfesiones(Profesiones profesiones) {
        String sql = "UPDATE profesiones SET descripcion = ? WHERE id_profesion = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, profesiones.getDescripcion());
            stmt.setInt(2, profesiones.getId_profesion());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProfesiones(Profesiones profesiones) {
        String sql = "DELETE FROM profesiones WHERE id_profesion = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, profesiones.getId_profesion());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
