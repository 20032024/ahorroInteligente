package DAL.daos.impls;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.ICategoriaDAO;
import DAL.entities.Clasificacion_gastos;


public class Clasificacion_gastosDAOImpl implements ICategoriaDAO {
    private Connection conn; 
    private PreparedStatement query; 

    public Clasificacion_gastosDAOImpl () {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
        //Método para obtener todas las clasificaciones
    @Override
    public List<Clasificacion_gastos> getClasificacion_gasto() {
        List<Clasificacion_gastos> clasificaciones = new ArrayList<>();
        try { 
           query = conn.prepareStatement("SELCT * FROM clasificacion_gastos");
           ResultSet rs = query.executeQuery(); 

           while (rs.next()) {
            Clasificacion_gastos clasificacion = new Clasificacion_gastos();
            clasificacion.setId_clasificacion(rs.getInt("id"));
            clasificacion.setClave_clasificacion_gasto(rs.getInt("clave_clasificacion_gasto"));
            clasificacion.setDescripcion(rs.getString("descripcion")); 
           }
        } catch (   SQLException e) {
            e.printStackTrace();
        }
        return clasificaciones;
        
    }

    @Override
    public Clasificacion_gastos getClasificacion_gastosById(int id_clasificacion) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getClasificacion_gastosById'");
    }

    @Override
    public void deleteClasificacion_gastos(Clasificacion_gastos clasificacion_gastos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteClasificacion_gastos'");
    }

    @Override
    public void updateClasificacion_gastos(Clasificacion_gastos clasificacion_gastos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateClasificacion_gastos'");
    }


}
