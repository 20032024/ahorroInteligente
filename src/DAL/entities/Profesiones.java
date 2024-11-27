package DAL.entities;

public class Profesiones {
    private int id_profesion;
    private String descripcion;
    private int cve; //supongo que es la clave no?.

    
    public int getId_profesion() {
        return id_profesion;
    }
    public void setId_profesion(int id_profesion) {
        this.id_profesion = id_profesion;
    }

    public int getCve() {
        return cve;
    }
    public void setCve(int cve) {
        this.cve = cve;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
}
