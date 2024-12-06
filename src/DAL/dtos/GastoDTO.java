package DAL.dtos;
    
    public class GastoDTO {//voy a obtener el id usuario en al momento de iniciar sesión
    private String fecha;
    private double monto;
    private String lugar;
    private String tipoGasto;
    private String categoria;

    // Constructor, getters y setters
    public GastoDTO(String tipoGasto, double monto, String categoria, String lugar, String fecha) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
        this.categoria = categoria;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    }
