package DAL.daos.interfaces;

import java.util.List;

import DAL.entities.Clasificacion_gastos;

public interface ICategoriaDAO {
public List<Clasificacion_gastos> getClasificacion_gasto();
public Clasificacion_gastos getClasificacion_gastosById(int id_clasificacion);
public void deleteClasificacion_gastos (Clasificacion_gastos clasificacion_gastos);
public void updateClasificacion_gastos (Clasificacion_gastos clasificacion_gastos);


}
