package DAL.dtos;

import java.math.BigDecimal;

public class ReporteDTO {
    private BigDecimal totalGastos;
    private BigDecimal totalHormiga;
    private BigDecimal totalBase;
    private BigDecimal porcentajeHormiga;

    public ReporteDTO(BigDecimal totalGastos, BigDecimal totalHormiga, BigDecimal totalBase, BigDecimal porcentajeHormiga) {
        this.totalGastos = totalGastos;
        this.totalHormiga = totalHormiga;
        this.totalBase = totalBase;
        this.porcentajeHormiga = porcentajeHormiga;
    }

    public BigDecimal getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(BigDecimal totalGastos) {
        this.totalGastos = totalGastos;
    }

    public BigDecimal getTotalHormiga() {
        return totalHormiga;
    }

    public void setTotalHormiga(BigDecimal totalHormiga) {
        this.totalHormiga = totalHormiga;
    }

    public BigDecimal getTotalBase() {
        return totalBase;
    }

    public void setTotalBase(BigDecimal totalBase) {
        this.totalBase = totalBase;
    }

    public BigDecimal getPorcentajeHormiga() {
        return porcentajeHormiga;
    }

    public void setPorcentajeHormiga(BigDecimal porcentajeHormiga) {
        this.porcentajeHormiga = porcentajeHormiga;
    }
}
