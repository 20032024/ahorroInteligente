package DAL.dtos;

import java.time.LocalDate;
//import java.util.List;

public class UsuarioRegistroDTO {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private byte edad;
    private String correo;
    private String contraseña;
    private LocalDate fechaRegistro;
    private int id_tipoIngreso;
    private int id_profesion;
    private double montoIngreso;
   // private List<ProfesionDTO> profesiones; // Lista de profesiones del usuario

    // Constructor
    public UsuarioRegistroDTO(String nombre, String apPaterno, String apMaterno, byte edad, 
                              String correo, String contraseña, LocalDate fechaRegistro, int id_tipoIngreso, int id_profesion,double montoIngreso) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.correo = correo;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
        this.id_profesion=id_profesion;
        this.id_tipoIngreso=id_tipoIngreso;
        this.montoIngreso=montoIngreso;
   //     this.profesiones = profesiones;
    }

     // Constructor vacío
     public UsuarioRegistroDTO() {
        // Este constructor es necesario para crear objetos sin parámetros
    }

//setters and getters 
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

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public int getId_tipoIngreso() {
        return id_tipoIngreso;
    }

    public void setId_tipoIngreso(int id_tipoIngreso) {
        this.id_tipoIngreso = id_tipoIngreso;
    }

    public int getId_profesion() {
        return id_profesion;
    }

    public void setId_profesion(int id_profesion) {
        this.id_profesion = id_profesion;
    }

    public double getMontoIngreso() {
        return montoIngreso;
    }

    public void setMontoIngreso(double montoIngreso) {
        this.montoIngreso = montoIngreso;
    }

   /**  public List<ProfesionDTO> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(List<ProfesionDTO> profesiones) {
        this.profesiones = profesiones;
    }*/
}
