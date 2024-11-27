package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.ILugarDAO;
import DAL.entities.Lugar;

public class LugarDAOImpl implements ILugarDAO {
    private Connection conn;
    private PreparedStatement query;

    public LugarDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }

    //Método para obtener todos los Lugares
    @Override
    public List<Lugar> getLugares() {
       List<Lugar> lugares = new ArrayList<>();
       try { 
        query = conn.prepareStatement("SELECT * FROM lugares");
        ResultSet rs = query.executeQuery();

        while (rs.next()) {
            Lugar lugar = new Lugar ();
            lugar.setId_lugar(rs.getInt("id"));
            lugar.setDescripcion(rs.getString("descripcion"));
            lugar.setClave_tipo_gasto(rs.getInt("clave_tipo_gasto"));
            lugar.setLatitud(rs.getDouble("latitud"));
            lugar.setLongitud(rs.getDouble("longitud"));
        }
       } catch (SQLException e) {
        e.printStackTrace();
       }
       return lugares;
    }

    @Override
    public Lugar getLugaresById(int id_lugar) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLugaresById'");
    }

    @Override
    public void updateLugares(Lugar lugares) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateLugares'");
    }

    @Override
    public void delteLugares(Lugar lugares) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delteLugares'");
    }
}
