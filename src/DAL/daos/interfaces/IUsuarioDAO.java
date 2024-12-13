package DAL.daos.interfaces;
import java.util.List;

import DAL.dtos.UsuarioRegistroDTO;
import DAL.entities.Usuario;

public interface IUsuarioDAO {
	//declaración de métodos para acceder a la base de datos
	public boolean addUsuario(UsuarioRegistroDTO usuario);//create usuario
	public Usuario getUsuariosById(int idUsuario);//Read un usuario
	public boolean updateUsuario(Usuario usuario); 
	public boolean deleteUsuario(int idUsuario);

	public List<Usuario> getUsuarios(); //Read todos los usuarios
	public int validarCredenciales(String correo, String contraseña);
	public boolean validarCorreoExistente (String correo);
}
