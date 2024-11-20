package DAL.connection.PostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import DAL.connection.AbstractStrategyDbConn;
import DAL.connection.config.SettingsDbConn;

public class PostgresDbConn extends AbstractStrategyDbConn<Connection> {
    //Unica instacia de la clase
    private static PostgresDbConn instanciaConn;
    
    //Propiedad para conexion con BD
    private Connection conn;

    //Constructor privado
    private PostgresDbConn() {
        try { 
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
        try {
            SettingsDbConn propDb = new SettingsDbConn ("settingsDbPostgreSQL.properties"); 
            conn = DriverManager.getConnection(propDb.getDB_URI(), propDb.getUSUARIO(), propDb.getPASS());
            System.out.println("Conexion Exitosa... 👌");
        } catch (SQLException e) {
            System.out.println("Ocurrio error al conectarse: 💀" + e.getMessage());
        }
    }

    public static PostgresDbConn getDbConnInstance() {
        if (instanciaConn == null) 
            instanciaConn = new PostgresDbConn();
        
        return instanciaConn;
    }

    @Override
    public Connection getConectionDB() {
        return conn;
    }
}
