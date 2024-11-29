package DAL.daos.interfaces;

import java.util.List;
import DAL.entities.Usuario;

public interface IUsuarioDAO {
	//declaración de métodos para acceder a la base de datos
	public List<Usuario> getUsers();
	public Usuario getUsersById(int id);
	public void updateUser(Usuario user);
	public void deleteUser(Usuario user);
}