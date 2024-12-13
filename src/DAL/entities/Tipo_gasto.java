package DAL.entities;

public class Tipo_gasto {
    private int id_tipoGasto;
    private String descripcion; 
    private int clave_tipoGasto;

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getId_tipoGasto() {
        return id_tipoGasto;
    }
    public void setId_tipoGasto(int id_tipoGasto) {
        this.id_tipoGasto = id_tipoGasto;
    }
    public int getClave_tipoGasto() {
        return clave_tipoGasto;
    }
    public void setClave_tipoGasto(int clave_tipoGasto) {
        this.clave_tipoGasto = clave_tipoGasto;
    }
    
}
