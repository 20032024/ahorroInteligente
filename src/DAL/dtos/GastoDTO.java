package DAL.dtos;
import java.time.LocalDate;

    
    public class GastoDTO {//voy a obtener el id usuario en al momento de iniciar sesión
    private LocalDate fecha;
    private double monto;
    private String lugar;
    private String tipoGasto;
    private String categoria;
    private int id_usuario;

    // Constructor, getters y setters
    public GastoDTO(String tipoGasto, double monto, 
                    String categoria, String lugar, LocalDate fecha,
                    int id_usuario) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    }
