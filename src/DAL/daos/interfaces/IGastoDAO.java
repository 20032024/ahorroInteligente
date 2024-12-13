package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Gasto;
import DAL.dtos.GastoDTO;

public interface IGastoDAO {
public List<GastoDTO> getGastosUsuario(int idUsuario);
public Gasto getGastoIdGasto (int id_gasto);
public void updateGasto (Gasto gastos);
public void deleteGasto (Gasto gastos);
public boolean registrarGasto(Gasto gasto);
}
