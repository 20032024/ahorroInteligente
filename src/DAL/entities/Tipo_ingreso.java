package DAL.entities;

public class Tipo_ingreso {
    private int id_tipoIngreso;
    private int clave_tipoIngeso; //no sé qué es cve jajajaja
    private String descripcion;
    
    public int getId_tipoIngreso() {
        return id_tipoIngreso;
    }
    public void setId_tipoIngreso(int id_tipoIngreso) {
        this.id_tipoIngreso = id_tipoIngreso;
    }
   
    public int getClave_tipoIngeso() {
        return clave_tipoIngeso;
    }
    public void setClave_tipoIngeso(int clave_tipoIngeso) {
        this.clave_tipoIngeso = clave_tipoIngeso;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
}
