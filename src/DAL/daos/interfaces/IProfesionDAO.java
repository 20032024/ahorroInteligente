package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Profesion;


public interface IProfesionDAO {
public List<Profesion> getProfesiones();
public Profesion getProfesionesById(int id_profesion);
public void updateProfesiones(Profesion profesiones);
public void deleteProfesiones(Profesion profesiones);
}

//declaración de métodos para acceder a la base de datos

	//public Usuarios getUsuariosById(int id);
	//public void updateUser(Usuarios usuario);
	//public void deleteUser(Usuarios usuario);

