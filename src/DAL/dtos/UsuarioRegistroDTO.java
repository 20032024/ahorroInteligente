package DAL.dtos;

import java.time.LocalDate;
import java.util.List;

public class UsuarioRegistroDTO {
    private int id_UsuarioRegistro; 
    private String nombre;             // Nombre del usuario
    private String apellidoPaterno;    // Apellido paterno
    private String apellidoMaterno;    // Apellido materno
    private int edad;                  // Edad del usuario
    private String correo;             // Correo electrónico
    private String contraseña;         // Contraseña
    private List<ProfesionDTO> profesiones; // Lista de profesiones asociadas
    private LocalDate fechaRegistro;   // Fecha de registro (generada automáticamente)

    // Constructor vacío
    public UsuarioRegistroDTO() {
    }

    // Constructor completo
    public UsuarioRegistroDTO(String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
                              String correo, String contraseña, List<ProfesionDTO> profesiones) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.profesiones = profesiones;
        this.fechaRegistro = LocalDate.now(); // Se genera automáticamente
    }
    public int getId_UsuarioRegistro() {
        return id_UsuarioRegistro;
    }

    public void setId_UsuarioRegistro(int id_UsuarioRegistro) {
        this.id_UsuarioRegistro = id_UsuarioRegistro;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<ProfesionDTO> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(List<ProfesionDTO> profesiones) {
        this.profesiones = profesiones;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
