package DAL.entities;

public class Tipos_gasto {
    private int id_tipo_gasto;
    private String descripcion; 
    private int clave_tipo_gasto;

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getId_tipo_gasto() {
        return id_tipo_gasto;
    }
    public void setId_tipo_gasto(int id_tipo_gasto) {
        this.id_tipo_gasto = id_tipo_gasto;
    }
    public int getClave_tipo_gasto() {
        return clave_tipo_gasto;
    }
    public void setClave_tipo_gasto(int clave_tipo_gasto) {
        this.clave_tipo_gasto = clave_tipo_gasto;
    }
    
}
