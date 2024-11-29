package DAL.entities;

public class Profesion {
    private int id_profesion;
    public int getId_profesion() {
        return id_profesion;
    }
    public void setId_profesion(int id_profesion) {
        this.id_profesion = id_profesion;
    }
    private int cve; //supongo que es la clave no?.
    public int getCve() {
        return cve;
    }
    public void setCve(int cve) {
        this.cve = cve;
    }
    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    } 
}
