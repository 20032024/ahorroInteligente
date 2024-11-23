package DAL.dtos;

    // DTO para representar una profesión con un ingreso asociado
public class ProfesionDTO {
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
