package DAL.entities;

import java.sql.Date;

public class Gasto {
    private int id_gasto; 
    private int id; //Utilizo como referencia el id Usuario. 
    private Date fecha; 
    private double monto; 
    private float metodo_pago; // 1.- Tarjeta y 2.- Efectivo
    private int id_lugar; 
    private int id_clasificacion; 
    private int id_tipo_gasto;
}
