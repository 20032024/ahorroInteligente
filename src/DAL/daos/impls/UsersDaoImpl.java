package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IUsersDAO;
import DAL.entities.User;

public class UsersDaoImpl implements IUsersDAO {
    private Connection conn;
    private PreparedStatement query;

    public UsersDaoImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
    
    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUsersById(int id) {
        return null;
    }

    @Override
    public void updateUser(User user) {
        
    }

    @Override
    public void deleteUser(User user) {
        
    }
    
}
