package DAL.dtos;

import java.util.Date;
    
    public class GastoDTO {
        private int id; // Se generará automáticamente por la base de datos
        private int usuarioId; // Usuario asociado (ID del usuario logueado)
        private Date fechaRegistro; // Fecha del registro (asignada automáticamente por el sistema)
        private double monto;
        private String metodoPago; // "efectivo" o "tarjeta"
        private CategoriaDTO categoria; // Categoría asociada
        private LugarDTO lugar; // Lugar asociado
        private String tipoGasto; // "Base" o "Hormiga", se determinará en el BLO
    
        // Constructores
        public GastoDTO() {}
    
        public GastoDTO(int usuarioId, double monto, String metodoPago, CategoriaDTO categoria, LugarDTO lugar, String tipoGasto) {
            this.usuarioId = usuarioId;
            this.fechaRegistro = new Date(); // Asignar la fecha actual al crear un gasto
            this.monto = monto;
            this.metodoPago = metodoPago;
            this.categoria = categoria;
            this.lugar = lugar;
            this.tipoGasto = tipoGasto;
        }
    
        // Getters y setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public int getUsuarioId() {
            return usuarioId;
        }
    
        public void setUsuarioId(int usuarioId) {
            this.usuarioId = usuarioId;
        }
    
        public Date getFechaRegistro() {
            return fechaRegistro;
        }
    
        public void setFechaRegistro(Date fechaRegistro) {
            this.fechaRegistro = fechaRegistro;
        }
    
        public double getMonto() {
            return monto;
        }
    
        public void setMonto(double monto) {
            this.monto = monto;
        }
    
        public String getMetodoPago() {
            return metodoPago;
        }
    
        public void setMetodoPago(String metodoPago) {
            this.metodoPago = metodoPago;
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