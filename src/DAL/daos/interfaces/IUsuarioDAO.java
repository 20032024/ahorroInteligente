package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Usuario;

public interface IUsuarioDAO {
	//declaración de métodos para acceder a la base de datos
	public List<Usuario> getUsuarios();
	public Usuario getUsuariosById(int id);
	public void updateUser(Usuario usuario);
	public void deleteUser(Usuario usuario);
}
