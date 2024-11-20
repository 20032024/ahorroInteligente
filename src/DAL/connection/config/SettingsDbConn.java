package DAL.connection.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SettingsDbConn {
    private String DB_URI;
    private String USUARIO;
    private String PASS;

    public SettingsDbConn(String propertiesFile) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("F:/Java/DAO/DAL/connection/config/"+propertiesFile)));

            this.DB_URI = properties.getProperty("DB_URI");
            this.USUARIO = properties.getProperty("USUARIO");
            this.PASS = properties.getProperty("PASS");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDB_URI() {
        return DB_URI.substring(1, this.DB_URI.length()-1);
    }

    public String getPASS() {
        return PASS.substring(1, this.PASS.length()-1);
    }

    public String getUSUARIO() {
        return USUARIO.substring(1, this.USUARIO.length()-1);
    }
}
