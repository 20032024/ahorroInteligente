package DAL.entities;

import java.sql.Date;
import java.util.List;

public class Usuarios {
    private int id;
    private String nombreUsuario;
    private byte edad;
    private float ingresos;
    private String correo;
    private String contraseña;
    private Date fecha_registro;
    private List<Role> roles;

    public int getId() {
        return id;
    }

    public String getNombreUsuarios() {
        return nombreUsuario;
    }

    public byte getEdad() {
        return edad;
    }

    public float getIngresos() {
        return ingresos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Date getFecha_Registros() {
        return fecha_registro;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFecha_Registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
