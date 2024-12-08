package DAL.dtos;
import java.time.LocalDate;  
    public class GastoDTO {//voy a obtener el id usuario en al momento de iniciar sesión
    private LocalDate fecha;
    private double monto;
    private String lugar;
    private int id_lugar;
    private String tipoGasto;
    private int id_tipoGasto;
    private String categoria;
    private int id_categoria;
    private int id_usuario;
  //  private String metodoPago;
    private String descripcion;

    // Constructor para mostrar gastos
    public GastoDTO(String descripcion,  double monto, String tipoGasto,
                    String categoria, String lugar, LocalDate fecha,
                    int id_usuario) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
        this.categoria = categoria;
        this.lugar = lugar;
        this.fecha = fecha;
    }
     // Constructor para registro
     public GastoDTO(double monto, String descripcion, int tipoGastoId, 
                    int categoriaId, int lugarId, int idUsuario, LocalDate fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.id_tipoGasto = tipoGastoId;
        this.id_categoria = categoriaId;
      //  this.id_metodoPago = metodoPagoId;
        this.id_lugar = lugarId;
        this.id_usuario = idUsuario;
        this.fecha=fecha;
}


    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }
    public int getId_tipoGasto() {
        return id_tipoGasto;
    }

    public void setId_tipoGasto(int id_tipoGasto) {
        this.id_tipoGasto = id_tipoGasto;
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
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public int getId_lugar() {
        return id_lugar;
    }

    public void setid_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
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
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    }
