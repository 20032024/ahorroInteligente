package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Usuarios;

public interface IUsuarioDAO {
	//declaración de métodos para acceder a la base de datos
	public List<Usuarios> getUsuarios();
	public Usuarios getUsuariosById(int id);
	public void updateUser(Usuarios usuario);
	public void deleteUser(Usuarios usuario);
}
