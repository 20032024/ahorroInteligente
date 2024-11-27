package DAL.dtos;

    // DTO para representar una profesión con un ingreso asociado
public class ProfesionDTO {
    private int id_profesion;
    private String nombre;      // Nombre de la profesión
    private double ingreso;     // Ingreso asociado a esa profesión

    // Constructor vacío
    public ProfesionDTO() {
    }

    // Constructor completo
    public ProfesionDTO(String nombre, double ingreso) {
        this.nombre = nombre;
        this.ingreso = ingreso;
    }

    // Getters y Setters

    public int getId_profesion() {
        return id_profesion;
    }

    public void setId_profesion(int id_profesion) {
        this.id_profesion = id_profesion;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }
}
