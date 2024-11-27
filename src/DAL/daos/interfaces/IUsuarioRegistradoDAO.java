package DAL.daos.interfaces;
import java.util.List;
import DAL.dtos.UsuarioRegistroDTO;
import DAL.entities.Usuarios_profesion; 


public interface IUsuarioRegistradoDAO {
    //declaración de métodos para acceder a la base de datos
public List<Usuarios_profesion> getUsuariosRegistro();
public Usuarios_profesion getUsuarioRegistroById(int id);
public void updateUser(UsuarioRegistroDTO usuarioResgitrado);
public void deleteUser(UsuarioRegistroDTO usuarioRegistrado);

}
