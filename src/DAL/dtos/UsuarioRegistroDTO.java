package DAL.dtos;

import java.util.Date;
import java.util.List;

public class UsuarioRegistroDTO {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private byte edad;
    private String correo;
    private String contraseña;
    private Date fechaRegistro;
    private List<ProfesionDTO> profesiones; // Lista de profesiones del usuario

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
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

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public List<ProfesionDTO> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(List<ProfesionDTO> profesiones) {
        this.profesiones = profesiones;
    }
}
