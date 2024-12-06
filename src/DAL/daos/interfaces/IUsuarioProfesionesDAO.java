package DAL.daos.interfaces;

import java.util.List;
import DAL.entities.Profesion;

public interface IUsuarioProfesionesDAO {
    List<Profesion> getProfesionesUsuario(int idUsuario); // profesiones del usuario
    public boolean addProfesion(int idUsuario, int idProfesion, int idTipoIngreso, float montoIngreso);
    boolean deleteProfesion(int idUsuario, int idProfesion); // eliminar una profesión 
	
}
