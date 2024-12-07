package DAL.daos.impls;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.converters.UsuarioConverter;
import DAL.daos.interfaces.IUsuarioDAO;
import DAL.dtos.ProfesionDTO;
import DAL.dtos.UsuarioRegistroDTO;
import DAL.entities.Usuario;

public class UsuarioDaoImpl implements IUsuarioDAO {
    private Connection conn;
    private PreparedStatement query;

    public UsuarioDaoImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }

        // Método para agregar un nuevo usuario (Create)
        @Override
        public boolean addUsuario(UsuarioRegistroDTO usuarioRegistroDTO) {
           boolean resultado = false;
        String procedimiento = "{CALL registrar_usuario(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";

    try (PreparedStatement stmt = conn.prepareStatement(procedimiento)) {
        // Crear una instancia de UsuarioConverter
        UsuarioConverter converter = new UsuarioConverter();
        // Convertir DTO a Entity con el convertidor
        Usuario usuarioEntity = converter.toEntity(usuarioRegistroDTO);

        // Configurar los parámetros del procedimiento almacenado
        stmt.setString(1, usuarioEntity.getNombre());
        stmt.setString(2, usuarioEntity.getApPaterno());
        stmt.setString(3, usuarioEntity.getApMaterno());
        stmt.setInt(4, usuarioEntity.getEdad());
        stmt.setString(5, usuarioEntity.getCorreo());
        stmt.setString(6, usuarioEntity.getContraseña());
        stmt.setDate(7, new java.sql.Date(usuarioEntity.getFechaRegistro().getTime()));

        ProfesionDTO profesionDTO = usuarioRegistroDTO.getProfesiones().get(0); // Accedemos a la primera profesión
        // Tomar los datos de la profesión y el ingreso
        stmt.setInt(8, profesionDTO.getIdProfesion());
        stmt.setInt(9, profesionDTO.getIdTipoIngreso());
        stmt.setBigDecimal(10, BigDecimal.valueOf(profesionDTO.getMontoIngreso())); // Convertir double a BigDecimal


        // Ejecutar el procedimiento almacenado
        resultado = stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return resultado;
        }

    // Método para obtener todos los usuarios
    @Override
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            query = conn.prepareStatement("SELECT * FROM usuarios");
            ResultSet rs = query.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEdad(rs.getByte("edad"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setFechaRegistro(rs.getDate("fechaRegistro"));
                usuarios.add(usuario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }


    // Método para actualizar un usuario existente (Update)
    @Override
    public boolean updateUsuario(Usuario usuario) {
        try {
            query = conn.prepareStatement(
                    "UPDATE usuarios SET nombre_usuario = ?, edad = ?, correo = ?, contraseña = ?, fecha_registro = ? WHERE id = ?");
            query.setString(1, usuario.getNombre());
            query.setByte(2, usuario.getEdad());
            query.setString(3, usuario.getCorreo());
            query.setString(4, usuario.getContraseña());
            query.setDate(5, new java.sql.Date(usuario.getFechaRegistro().getTime()));
            query.setInt(6, usuario.getId_usuario());

            return query.executeUpdate() > 0; // Retorna true si la actualización fue exitosa
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para eliminar un usuario (Delete)
    @Override
    public boolean deleteUsuario(int id) {
        try {
            query = conn.prepareStatement("DELETE FROM usuarios WHERE id = ?");
            query.setInt(1, id);

            return query.executeUpdate() > 0; // Retorna true si la eliminación fue exitosa
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para obtener un usuario por su ID (Read por ID)
    @Override
    public Usuario getUsuariosById(int id) {
        Usuario usuario = null;
        try {
            query = conn.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
            query.setInt(1, id);

            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(rs.getInt("id_usuario"));
                usuario.setNombre(rs.getString("nombre"));
                usuario.setEdad(rs.getByte("edad"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setFechaRegistro(rs.getDate("fechaRegistro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public int validarCredenciales(String correo, String contraseña){
        int userId = 0;
        try {
            query = conn.prepareStatement("SELECT id_usuario FROM usuarios WHERE correo = ? AND contrasena = ?");
            query.setString(1, correo);
            query.setString(2, contrasena);

            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                userId = rs.getInt("id_usuario"); // Extrae el id_usuario
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de errores aquí
        }
        return userId; // Devuelve 0 si no se encuentra el usuario
    }
}