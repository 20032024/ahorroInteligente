package DAL.entities;

import java.sql.Date;

public class Gasto {
    private int id_gasto; 
    private int id_usuario; //Utilizo como referencia el id Usuario. 
    private Date fecha; 
    private double monto; 
    private float metodo_pago; // 1.- Tarjeta y 2.- Efectivo
    private int id_lugar; 
    private int id_clasificacion; 
    private int id_tipo_gasto;

    public int getId_gasto() {
        return id_gasto;
    }
    public void setId_gasto(int id_gasto) {
        this.id_gasto = id_gasto;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public float getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(float metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    public int getId_lugar() {
        return id_lugar;
    }
    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }
    public int getId_clasificacion() {
        return id_clasificacion;
    }
    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }
    public int getId_tipo_gasto() {
        return id_tipo_gasto;
    }
    public void setId_tipo_gasto(int id_tipo_gasto) {
        this.id_tipo_gasto = id_tipo_gasto;
    }
}
