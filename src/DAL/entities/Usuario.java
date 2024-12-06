package DAL.entities;
import java.util.Date;

public class Usuario {
    private int id_usuario;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private byte edad;
    private String correo;
    private String contraseña;
    private Date fechaRegistro;

// Getters y setters
public int getId_usuario() {
    return id_usuario;
}

public void setId_usuario(int id_usuario) {
    this.id_usuario = id_usuario;
}

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

}
