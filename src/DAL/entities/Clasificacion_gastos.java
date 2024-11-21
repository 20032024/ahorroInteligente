package DAL.entities;

public class Clasificacion_gastos {
    private int id_clasificacion;
    private String descripcion; 
    private int clave_clasificacion_gasto;

    public int getId_clasificacion() {
        return id_clasificacion;
    }
    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getClave_clasificacion_gasto() {
        return clave_clasificacion_gasto;
    }
    public void setClave_clasificacion_gasto(int clave_clasificacion_gasto) {
        this.clave_clasificacion_gasto = clave_clasificacion_gasto;
    } 
}   
