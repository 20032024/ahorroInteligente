package DAL.dtos;

import java.util.List;

public class UsuarioProfesionDTO {
    private String nombreUsuario; // Nombre completo del usuario
    private List<ProfesionIngreso> profesiones; // Lista de profesiones con sus ingresos

    // Constructor vacío
    public UsuarioProfesionDTO() {}

    // Constructor completo
    public UsuarioProfesionDTO(String nombreCompletoUsuario, List<ProfesionIngreso> profesiones) {
        this.nombreUsuario = nombreCompletoUsuario;
        this.profesiones = profesiones;
    }

    // Getters y setters
    public String getNombreCompletoUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public List<ProfesionIngreso> getProfesiones() {
        return profesiones;
    }

    public void setProfesiones(List<ProfesionIngreso> profesiones) {
        this.profesiones = profesiones;
    }

    // Clase interna para representar una profesión con ingreso
    public static class ProfesionIngreso {
        private String descripcionProfesion; // Descripción de la profesión
        private float montoIngreso; // Monto del ingreso asociado

        // Constructor vacío
        public ProfesionIngreso() {}

        // Constructor completo
        public ProfesionIngreso(String descripcionProfesion, float montoIngreso) {
            this.descripcionProfesion = descripcionProfesion;
            this.montoIngreso = montoIngreso;
        }

        // Getters y setters
        public String getDescripcionProfesion() {
            return descripcionProfesion;
        }

        public void setDescripcionProfesion(String descripcionProfesion) {
            this.descripcionProfesion = descripcionProfesion;
        }

        public float getMontoIngreso() {
            return montoIngreso;
        }

        public void setMontoIngreso(float montoIngreso) {
            this.montoIngreso = montoIngreso;
        }
    }
}

