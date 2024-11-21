package DAL.daos.interfaces;

import java.util.List;
import DAL.entities.Usuarios;

public interface IUsuarioDAO {
	//declaración de métodos para acceder a la base de datos
	public List<Usuarios> getUsers();
	public Usuarios getUsersById(int id);
	public void updateUser(Usuarios user);
	public void deleteUser(Usuarios user);
}