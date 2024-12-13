package DAL.entities;

import java.time.LocalDate;

public class Gasto {
    private int id_gasto; 
    private int id_usuario; //Utilizo como referencia el id Usuario. 
    private LocalDate fecha; 
    private double monto; 
    private String metodo_pago; // 1.- Tarjeta y 2.- Efectivo
    private int id_lugar; 
    private int id_categoria; 
    private int id_tipoGasto;

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
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getMetodo_pago() {
        return metodo_pago;
    }
    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    public int getId_lugar() {
        return id_lugar;
    }
    public void setId_lugar(int id_lugar) {
        this.id_lugar = id_lugar;
    }
    public int getId_categoria() {
        return id_categoria;
    }
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    public int getId_tipoGasto() {
        return id_tipoGasto;
    }
    public void setId_tipoGasto(int id_tipoGasto) {
        this.id_tipoGasto = id_tipoGasto;
    }
}
