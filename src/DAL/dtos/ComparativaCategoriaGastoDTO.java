package DAL.dtos;

public class ComparativaCategoriaGastoDTO {
    private String categoria;
    private double totalGastos;  // Total de los gastos para una categoría
    private double porcentajeCambio;  // Cambio porcentual comparado con el periodo anterior

    // Constructor, getters y setters
    public ComparativaCategoriaGastoDTO(String categoria, double totalGastos, double porcentajeCambio) {
        this.categoria = categoria;
        this.totalGastos = totalGastos;
        this.porcentajeCambio = porcentajeCambio;
    }

    // Getters y setters
    public String getCategoria() { 
        return categoria; 
    }
    public void setCategoria(String categoria) { 
        this.categoria = categoria; 
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
