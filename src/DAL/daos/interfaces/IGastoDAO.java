package DAL.daos.interfaces;
import java.util.List;
import DAL.entities.Gasto;

public interface IGastoDAO {
public List<Gasto> getGastos();
public Gasto getGastoIdGasto (int id_gasto);
public void updateGasto (Gasto gastos);
public void deleteGasto (Gasto gastos);
}
