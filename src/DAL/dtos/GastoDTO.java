package DAL.dtos;

import java.util.Date;
    
    public class GastoDTO {
        private int id_usuario;
        private int id_gasto; // Se generará automáticamente por la base de datos
        private Date fecha; // Fecha del registro (asignada automáticamente por el sistema)
        private double monto;
        private CategoriaDTO categoria; // Categoría asociada
        private LugarDTO lugar; // Lugar asociado
        private String tipoGasto; // "Base" o "Hormiga", se determinará en el BLO
    
        // Constructores
        public GastoDTO() {}
    
        public GastoDTO(int id_usuario, double monto, CategoriaDTO categoria, LugarDTO lugar, String tipoGasto) {
            this.id_usuario = id_usuario;
            this.fecha = new Date(); // Asignar la fecha actual al crear un gasto
            this.monto = monto;
            this.categoria = categoria;
            this.lugar = lugar;
            this.tipoGasto = tipoGasto;
        }
    
        // Getters y setters
        public int getId_usuario() {
            return id_usuario;
        }
    
        public void setId_usuario(int id_usuario) {
            this.id_usuario = id_usuario;
        }

        public int getId_gasto() {
            return id_gasto;
        }
    
        public void setId_gasto(int id_gasto) {
            this.id_gasto = id_gasto;
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
    
        public CategoriaDTO getCategoria() {
            return categoria;
        }
    
        public void setCategoria(CategoriaDTO categoria) {
            this.categoria = categoria;
        }
    
        public LugarDTO getLugar() {
            return lugar;
        }
    
        public void setLugar(LugarDTO lugar) {
            this.lugar = lugar;
        }
    
        public String getTipoGasto() {
            return tipoGasto;
        }
    
        public void setTipoGasto(String tipoGasto) {
            this.tipoGasto = tipoGasto;
        }
    }
