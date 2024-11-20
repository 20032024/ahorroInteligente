package DAL.daos.interfaces;

import java.util.List;
import DAL.entities.Role;

public interface IRolesDAO {
    public List<Role> getRoles();
	public Role getRoleById(int id);
	public void updateRole(Role Role);
	public void deleteRole (Role Role);
}
