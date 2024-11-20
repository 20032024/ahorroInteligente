package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IRolesDAO;
import DAL.entities.Role;


public class RoleDAOImpl implements IRolesDAO {
    private Connection conn;
    private PreparedStatement query;

    public RoleDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }
    
    @Override
    public List<Role> getRoles() {
        List<Role> roles = new ArrayList<Role>();
        try {
            query = conn.prepareStatement("select * from roles");
            ResultSet rs = query.executeQuery();

            while (rs.next()) {
                roles.add(new Role(rs.getLong(1), rs.getString(2)));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roles;
    }

    @Override
    public Role getRoleById(int id) {
        return null;
    }

    @Override
    public void updateRole(Role Role) {
        
    }

    @Override
    public void deleteRole(Role Role) {
        
    }

   
}
