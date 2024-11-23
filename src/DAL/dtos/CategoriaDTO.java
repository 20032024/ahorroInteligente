package DAL.dtos;

public class CategoriaDTO {
    private int id;
    private String descripcion;
    private String clave;
    
        // Constructores
    public CategoriaDTO() {}
    
    public CategoriaDTO(int id, String descripcion, String clave) {
        this.id = id;
        this.descripcion = descripcion;
        this.clave = clave;
    }
    
        // Getters y setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getDescripcion() {
            return descripcion;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public String getClave() {
            return clave;
        }
    
        public void setClave(String clave) {
            this.clave = clave;
        }
    }
