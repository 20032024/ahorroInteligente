package DAL.daos.impls;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IReporteDAO;
import DAL.dtos.ReporteDTO;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReporteDAOImpl implements IReporteDAO {
    private Connection conn;

    public ReporteDAOImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }

    @Override
    public ReporteDTO generarReporteMensual(int idUsuario, int mes, int anio) {
        ReporteDTO reporte = null;
        String sql = "{ CALL generar_reporte_mensual(?, ?, ?) }";

        try (CallableStatement stmt = conn.prepareCall(sql)) {
            stmt.setInt(1, idUsuario);
            stmt.setInt(2, mes);
            stmt.setInt(3, anio);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    reporte = new ReporteDTO(
                        rs.getBigDecimal("total_gastos"),
                        rs.getBigDecimal("total_hormiga"),
                        rs.getBigDecimal("total_base"),
                        rs.getBigDecimal("porcentaje_hormiga")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reporte;
    }
}

