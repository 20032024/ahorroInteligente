package DAL.entities;

public class Lugar {
    private int id_lugar;
    private String descripcion; 
    private int clave_tipo_gasto;
    private double latitud;
    private double longitud;

    
    public int getId_lugar() {
        return id_lugar;
    }
    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getClave_tipo_gasto() {
        return clave_tipo_gasto;
    }
    public void setClave_tipo_gasto(int clave_tipo_gasto) {
        this.clave_tipo_gasto = clave_tipo_gasto;
    } 
    public double getLatitud() {
        return latitud;
    }
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    } 
}
