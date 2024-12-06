package DAL.daos.interfaces;

import DAL.dtos.ReporteDTO;

public interface IReporteDAO {
  ReporteDTO generarReporteMensual(int idUsuario, int mes, int anio);
}



