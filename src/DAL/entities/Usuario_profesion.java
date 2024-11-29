package DAL.entities;

public class Usuario_profesion {
    private int id_usuario_profesion; 
    private int id_usuario; //utilizo esto como referencia que se debe implementar el id de Usuario. 
    private int id_profesion;
    private int id_tipo_ingreso;
    private float monto_ingreso;  

    public int getId_usuario_profesion() {
        return id_usuario_profesion;
    }
    public void setId_usuario_profesion(int id_usuario_profesion) {
        this.id_usuario_profesion = id_usuario_profesion;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public int getId_tipo_ingreso() {
        return id_tipo_ingreso;
    }
    public void setId_tipo_ingreso(int id_tipo_ingreso) {
        this.id_tipo_ingreso = id_tipo_ingreso;
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
