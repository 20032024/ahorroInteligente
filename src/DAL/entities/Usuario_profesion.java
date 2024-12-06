package DAL.entities;

public class Usuario_profesion {
    private int id_usuarioProfesion; 
    private int id_usuario; //utilizo esto como referencia que se debe implementar el id de Usuario. 
    private int id_profesion;
    private int id_tipoIngreso;
    private float monto_ingreso;  

    public int getId_usuarioProfesion() {
        return id_usuarioProfesion;
    }
    public void setId_usuario_profesion(int id_usuarioProfesion) {
        this.id_usuarioProfesion = id_usuarioProfesion;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
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
    public float getMonto_ingreso() {
        return monto_ingreso;
    }
    public void setMonto_ingreso(float monto_ingreso) {
        this.monto_ingreso = monto_ingreso;
    }

}
