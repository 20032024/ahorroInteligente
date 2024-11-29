package DAL.entities;

public class Tipo_ingreso {
    private int id_tipo_ingreso;
    private int clave_tipo_ingeso; //no sé qué es cve jajajaja
    private String descripcion;
    
    public int getId_tipo_ingreso() {
        return id_tipo_ingreso;
    }
    public void setId_tipo_ingreso(int id_tipo_ingreso) {
        this.id_tipo_ingreso = id_tipo_ingreso;
    }
   
    public int getClave_tipo_ingeso() {
        return clave_tipo_ingeso;
    }
    public void setClave_tipo_ingeso(int clave_tipo_ingeso) {
        this.clave_tipo_ingeso = clave_tipo_ingeso;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 

    
}
