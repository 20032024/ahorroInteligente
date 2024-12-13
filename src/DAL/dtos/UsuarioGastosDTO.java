package DAL.dtos;

import java.util.List;

public class UsuarioGastosDTO {
    private int idUsuario;
    private String nombre;
    private String correo;
    private int edad;
    private List<GastoDTO> gastos; // Lista de gastos asociados al usuario

    // Constructores
    public UsuarioGastosDTO(){}
    
    public UsuarioGastosDTO(int idUsuario, String nombre, String correo, int edad, List<GastoDTO> gastos) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.gastos = gastos;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<GastoDTO> getGastos() {
        return gastos;
    }

    public void setGastos(List<GastoDTO> gastos) {
        this.gastos = gastos;
    }
}

