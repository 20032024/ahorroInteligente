package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IGastoDAO;
import DAL.entities.Gasto;

public class GastoDAOImpl implements IGastoDAO {
  private Connection conn;
  private PreparedStatement query;

  public GastoDAOImpl() {
    conn = PostgresDbConn.getDbConnInstance().getConectionDB();
  }

  @Override
  public List<Gasto> getGastos() {
    List<Gasto> gastos = new ArrayList<>();
    try {
      query = conn.prepareStatement("SELECT * FROM gastos");
      ResultSet rs = query.executeQuery();

      while (rs.next()) {
        Gasto gasto = new Gasto();
        gasto.setId_gasto(rs.getInt("id"));
        gasto.setId_usuario(rs.getInt("id_usuario"));
        gasto.setFecha(rs.getDate("fecha"));
        gasto.setMonto(rs.getDouble("monto"));
        gasto.setMetodo_pago(rs.getFloat("metodo_pago"));
        gasto.setId_lugar(rs.getInt("id_lugar"));
        gasto.setId_clasificacion(rs.getInt("id_clasificacion"));
        gasto.setId_tipo_gasto(rs.getInt("id_tipo_gasto"));
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
      query = conn.prepareStatement("SELECT * FROM gastos WHERE id = ?");
      query.setInt(1, id_gasto);
      ResultSet rs = query.executeQuery();

      if (rs.next()) {
        gasto = new Gasto();
        gasto.setId_gasto(rs.getInt("id"));
        gasto.setId_usuario(rs.getInt("id_usuario"));
        gasto.setFecha(rs.getDate("fecha"));
        gasto.setMonto(rs.getDouble("monto"));
        gasto.setMetodo_pago(rs.getFloat("metodo_pago"));
        gasto.setId_lugar(rs.getInt("id_lugar"));
        gasto.setId_clasificacion(rs.getInt("id_clasificacion"));
        gasto.setId_tipo_gasto(rs.getInt("id_tipo_gasto"));
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return gasto;
  }

  @Override
  public void updateGasto(Gasto gasto) {
    try {
      query = conn.prepareStatement(
          "UPDATE gastos SET id_usuario = ?, fecha = ?, monto = ?, metodo_pago = ?, id_lugar = ?, id_clasificacion = ?, id_tipo_gasto = ? WHERE id = ?");
      query.setInt(1, gasto.getId_usuario());
      query.setDate(2, new java.sql.Date(gasto.getFecha().getTime()));
      query.setDouble(3, gasto.getMonto());
      query.setFloat(4, gasto.getMetodo_pago());
      query.setInt(5, gasto.getId_lugar());
      query.setInt(6, gasto.getId_clasificacion());
      query.setInt(7, gasto.getId_tipo_gasto());
      query.setInt(8, gasto.getId_gasto());

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void deleteGasto(Gasto gastos) {
    try {
      query = conn.prepareStatement("DELETE FROM gastos WHERE id = ?");
      query.setInt(1, gastos.getId_gasto());
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
