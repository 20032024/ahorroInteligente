package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Profesiones;


public interface IProfesionDAO {
public List<Profesiones> getProfesiones();
public Profesiones getProfesionesById(int id_profesion);
public void updateProfesiones(Profesiones profesiones);
public void deleteProfesiones(Profesiones profesiones);
}

//declaración de métodos para acceder a la base de datos

	//public Usuarios getUsuariosById(int id);
	//public void updateUser(Usuarios usuario);
	//public void deleteUser(Usuarios usuario);

