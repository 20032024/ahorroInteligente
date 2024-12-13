package DAL.dtos;

    // DTO para representar una profesión con un ingreso asociado
public class ProfesionDTO {
    private int idProfesion;
    private String descripcion;
    private int idTipoIngreso;
    private double montoIngreso;

    // Constructor
    public ProfesionDTO(int idProfesion, String descripcion, int idTipoIngreso, double montoIngreso) {
        this.idProfesion = idProfesion;
        this.descripcion = descripcion;
        this.idTipoIngreso = idTipoIngreso;
        this.montoIngreso = montoIngreso;
    }

    // Getters y Setters
    public int getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(int idProfesion) {
        this.idProfesion = idProfesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdTipoIngreso() {
        return idTipoIngreso;
    }

    public void setIdTipoIngreso(int idTipoIngreso) {
        this.idTipoIngreso = idTipoIngreso;
    }

    public double getMontoIngreso() {
        return montoIngreso;
    }

    public void setMontoIngreso(double montoIngreso) {
        this.montoIngreso = montoIngreso;
    }
}
