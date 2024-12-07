package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IGastoDAO;
import DAL.dtos.GastoDTO;
import DAL.entities.Gasto;

public class GastoDAOImpl implements IGastoDAO {
    private Connection conn;

    public GastoDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }

    @Override
    public List<GastoDTO> getGastosUsuario(int idUsuario) {
        List<GastoDTO> gastos = new ArrayList<>();
        String sql = "SELECT " +
                     "  tg.descripcion AS tipo_gasto, " +
                     "  g.monto, " +
                     "  c.descripcion AS categoria, " +
                     "  l.descripcion AS lugar, " +
                     "  g.fecha " +
                     "FROM gasto g " +
                     "JOIN tipos_gasto tg ON g.id_tipoGasto = tg.id_tipoGasto " +
                     "JOIN categorias c ON g.id_categoria = c.id_categoria " +
                     "JOIN lugares l ON g.id_lugar = l.id_lugar " +
                     "WHERE g.id_usuario = ?";

        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, idUsuario);
            ResultSet rs = query.executeQuery();

            while (rs.next()) {
                gastos.add(new GastoDTO(
                    rs.getString("tipo_gasto"),
                    rs.getDouble("monto"),
                    rs.getString("categoria"),
                    rs.getString("lugar"),
                    rs.getDate("fecha").toLocalDate(),
                    rs.getInt("id_usuario")
                ));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gastos;
    }

    @Override
    public Gasto getGastoIdGasto(int id_gasto) {
        Gasto gasto = null;
        String sql = "SELECT * FROM gasto WHERE id_gasto = ?";

        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, id_gasto);
            ResultSet rs = query.executeQuery();

            if (rs.next()) {
                gasto = new Gasto();
                gasto.setId_gasto(rs.getInt("id_gasto"));
                gasto.setId_usuario(rs.getInt("id_usuario"));
                gasto.setFecha(rs.getDate("fecha").toLocalDate());
                gasto.setMonto(rs.getDouble("monto"));
                gasto.setMetodo_pago(rs.getString("metodo_pago"));
                gasto.setId_lugar(rs.getInt("id_lugar"));
                gasto.setId_categoria(rs.getInt("id_categoria"));
                gasto.setId_tipoGasto(rs.getInt("id_tipoGasto"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gasto;
    }

    @Override
    public void updateGasto(Gasto gasto) {
        String sql = "UPDATE gasto SET id_usuario = ?, fecha = ?, monto = ?, metodo_pago = ?, id_lugar = ?, id_categoria = ?, id_tipoGasto = ? WHERE id_gasto = ?";

        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, gasto.getId_usuario());
            query.setDate(2, java.sql.Date.valueOf(gasto.getFecha()));
            query.setDouble(3, gasto.getMonto());
            query.setString(4, gasto.getMetodo_pago());
            query.setInt(5, gasto.getId_lugar());
            query.setInt(6, gasto.getId_categoria());
            query.setInt(7, gasto.getId_tipoGasto());
            query.setInt(8, gasto.getId_gasto());

            query.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteGasto(Gasto gasto) {
        String sql = "DELETE FROM gasto WHERE id_gasto = ?";

        try (PreparedStatement query = conn.prepareStatement(sql)) {
            query.setInt(1, gasto.getId_gasto());
            query.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean registrarGasto(Gasto gasto) {
        String sql = "INSERT INTO gasto (id_usuario, id_tipoGasto, monto, id_categoria, id_lugar, metodo_pago, fecha) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, gasto.getId_usuario());
            stmt.setInt(2, gasto.getId_tipoGasto());
            stmt.setDouble(3, gasto.getMonto());
            stmt.setInt(4, gasto.getId_categoria());
            stmt.setInt(5, gasto.getId_lugar());
            stmt.setString(6, gasto.getMetodo_pago());
            stmt.setDate(7, java.sql.Date.valueOf(gasto.getFecha()));

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}







/**package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IGastoDAO;
import DAL.dtos.GastoDTO;
import DAL.entities.Gasto;

public class GastoDAOImpl implements IGastoDAO {
  private Connection conn;
  private PreparedStatement query;

  public GastoDAOImpl() {
    conn = PostgresDbConn.getDbConnInstance().getConectionDB();
  }

  @Override
  public List<GastoDTO> getGastosUsuario(int idUsuario) {//-------------------------------obtener gasto
    List<GastoDTO> gastos = new ArrayList<>();
    String sql = "SELECT " +
                 "  tg.descripcion AS tipo_gasto, " +
                 "  g.monto, " +
                 "  c.descripcion AS categoria, " +
                 "  l.descripcion AS lugar, " +
                 "  g.fecha " +
                 "FROM gasto g " +
                 "JOIN tipos_gasto tg ON g.id_tipoGasto = tg.id_tipoGasto " +
                 "JOIN categorias c ON g.id_categoria = c.id_categoria " +
                 "JOIN lugares l ON g.id_lugar = l.id_lugar " +
                 "WHERE g.id_usuario = ?";
    try{
      query = conn.prepareStatement(sql);
      query.setInt(1, idUsuario); // Establecer el ID del usuario
      ResultSet rs = query.executeQuery();

      while (rs.next()) {
        GastoDTO gasto = new GastoDTO(
          rs.getString("tipo_gasto"),
          rs.getDouble("monto"),
          rs.getString("categoria"),
          rs.getString("lugar"),
          rs.getString("fecha")
        );
        // Añadimos el objeto a la lista de gastos
        gastos.add(gasto);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return gastos;

  }

  @Override
  public Gasto getGastoIdGasto(int id_gasto) {
    Gasto gasto = null;
    try {
      query = conn.prepareStatement("SELECT * FROM gastos WHERE id_gasto = ?");
      query.setInt(1, id_gasto);
      ResultSet rs = query.executeQuery();

      if (rs.next()) {
        gasto = new Gasto();
        gasto.setId_gasto(rs.getInt("id_gasto"));
        gasto.setId_usuario(rs.getInt("id_usuario"));
        gasto.setFecha(rs.getDate("fecha"));
        gasto.setMonto(rs.getDouble("monto"));
        gasto.setMetodo_pago(rs.getString("metodo_pago"));
        gasto.setId_lugar(rs.getInt("id_lugar"));
        gasto.setId_categoria(rs.getInt("id_categoria"));
        gasto.setId_tipoGasto(rs.getInt("id_tipoGasto"));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return gasto;
  }

  @Override
  public void updateGasto(Gasto gasto) {//-------------------------------actualizar gasto
    try {
      query = conn.prepareStatement(
          "UPDATE gastos SET id_usuario = ?, fecha = ?, monto = ?, metodo_pago = ?, id_lugar = ?, id_categoria = ?, id_tipoGasto = ? WHERE id_gasto = ?");
      query.setInt(1, gasto.getId_usuario());
      query.setDate(2, new java.sql.Date(gasto.getFecha().getTime()));
      query.setDouble(3, gasto.getMonto());
      query.setString(4, gasto.getMetodo_pago());
      query.setInt(5, gasto.getId_lugar());
      query.setInt(6, gasto.getId_categoria());
      query.setInt(7, gasto.getId_tipoGasto());
      query.setInt(8, gasto.getId_gasto());

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void deleteGasto(Gasto gastos) {//-------------------------------borrar gastoo
    try {
      query = conn.prepareStatement("DELETE FROM gastos WHERE id = ?");
      query.setInt(1, gastos.getId_gasto());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

public boolean registrarGasto(Gasto gasto) {//-------------------------------crear gasto insertar
        String sql = "INSERT INTO Gastos (id_usuario, id_tipoGasto, monto, id_categoria, id_lugar, metodo_pago, fecha) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, gasto.getId_usuario()); // El id_usuario es pasado aquí
            stmt.setInt(2, gasto.getId_tipoGasto());
            stmt.setDouble(3, gasto.getMonto());
            stmt.setInt(4, gasto.getId_categoria());
            stmt.setInt(5, gasto.getId_lugar());
            stmt.setString(6, gasto.getMetodo_pago());
            stmt.setDate(7,new java.sql.Date(gasto.getFecha().getTime()));

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}*/
