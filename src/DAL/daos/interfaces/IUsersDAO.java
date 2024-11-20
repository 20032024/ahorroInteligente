package DAL.daos.interfaces;

import java.util.List;
import DAL.entities.User;

public interface IUsersDAO {
	//declaración de métodos para acceder a la base de datos
	public List<User> getUsers();
	public User getUsersById(int id);
	public void updateUser(User user);
	public void deleteUser(User user);
}