package DAL.dtos;

public class ComparativaTipoGastoDTO {
    private int id_comparativa_tipo_gasto;
    private String tipoGasto;  // Hormiga o Base
    private double totalGastos;  // Total de los gastos para un tipo
    private double porcentajeCambio;  // Cambio porcentual comparado con el periodo anterior

    // Constructor, getters y setters
    public ComparativaTipoGastoDTO(String tipoGasto, double totalGastos, double porcentajeCambio) {
        this.tipoGasto = tipoGasto;
        this.totalGastos = totalGastos;
        this.porcentajeCambio = porcentajeCambio;
    }

    // Getters y setters
    public int getId_comparativa_tipo_gasto() {
        return id_comparativa_tipo_gasto;
    }

    public void setId_comparativa_tipo_gasto(int id_comparativa_tipo_gasto) {
        this.id_comparativa_tipo_gasto = id_comparativa_tipo_gasto;
    }
    public String getTipoGasto() { 
        return tipoGasto; 
    }
    public void setTipoGasto(String tipoGasto) { 
        this.tipoGasto = tipoGasto; 
    }
    public double getTotalGastos() { 
        return totalGastos; 
    }
    public void setTotalGastos(double totalGastos) {
        this.totalGastos = totalGastos; 
    }
    public double getPorcentajeCambio() { 
        return porcentajeCambio; 
    }
    public void setPorcentajeCambio(double porcentajeCambio) { 
        this.porcentajeCambio = porcentajeCambio; 
    }    
}
