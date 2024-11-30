package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Lugar;

public interface ILugarDAO {
public List<Lugar> getLugares();
public Lugar getLugaresById (int id_lugar);
public void updateLugares (Lugar lugares);
public void delteLugares (Lugar lugares);
}
