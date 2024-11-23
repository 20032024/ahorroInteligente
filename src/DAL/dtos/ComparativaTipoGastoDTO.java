package DAL.dtos;

public class ComparativaTipoGastoDTO {
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
