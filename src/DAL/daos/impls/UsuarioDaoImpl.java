package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IUsuarioDAO;
import DAL.entities.Usuario;

public class UsuarioDaoImpl implements IUsuarioDAO {
    private Connection conn;
    private PreparedStatement query;

    public UsuarioDaoImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
    
    @Override
    public List<Usuario> getUsers() {
        return null;
    }

    @Override
    public Usuario getUsersById(int id) {
        return null;
    }

    @Override
    public void updateUser(Usuario user) {
        
    }

    @Override
    public void deleteUser(Usuario user) {
        
    }
    
}
