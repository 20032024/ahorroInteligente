package DAL.dtos;

public class LugarDTO {
    private int id; // Identificador único del lugar
    private String nombre; // Nombre del lugar
    private String clave; // Clave única (para búsquedas rápidas)
    private String descripcion; // Información adicional del lugar

    // Constructores
    public LugarDTO() {}

    public LugarDTO(int id, String nombre, String clave, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }   
}