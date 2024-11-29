package DAL.entities;

public class Categoria_gasto {
    private int id_categoria;
    private String descripcion; 
    private String claveCategoria;

    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getClaveCategoria() {
        return claveCategoria;
    }
    public void setClaveCategoria(String claveCategoria) {
        this.claveCategoria = claveCategoria;
    } 
}   
