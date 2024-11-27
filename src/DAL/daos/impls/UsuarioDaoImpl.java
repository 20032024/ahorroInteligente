package DAL.daos.impls;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAL.connection.PostgreSQL.PostgresDbConn;
import DAL.daos.interfaces.IUsuarioDAO;
import DAL.entities.Usuarios;

public class UsuarioDaoImpl implements IUsuarioDAO {
    private Connection conn;
    private PreparedStatement query;

    public UsuarioDaoImpl() {
        conn = PostgresDbConn.getDbConnInstance().getConectionDB();
    }

    // Método para obtener todos los usuarios
    @Override
    public List<Usuarios> getUsuarios() {
        List<Usuarios> usuarios = new ArrayList<>();
        try {
            query = conn.prepareStatement("SELECT * FROM usuarios");
            ResultSet rs = query.executeQuery();

            while (rs.next()) {
                Usuarios usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setEdad(rs.getByte("edad"));
                usuario.setIngresos(rs.getFloat("ingresos"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setFecha_Registro(rs.getDate("fecha_registro"));
                usuarios.add(usuario);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    // Método para agregar un nuevo usuario (Create)
    public boolean addUsuario(Usuarios usuario) {
        try {
            query = conn.prepareStatement(
                    "INSERT INTO usuarios (nombre_usuario, edad, ingresos, correo, contraseña, fecha_registro) VALUES (?, ?, ?, ?, ?, ?)");
            query.setString(1, usuario.getNombreUsuarios());
            query.setByte(2, usuario.getEdad());
            query.setFloat(3, usuario.getIngresos());
            query.setString(4, usuario.getCorreo());
            query.setString(5, usuario.getContraseña());
            query.setDate(6, usuario.getFecha_Registros());

            return query.executeUpdate() > 0; // Retorna true si la inserción fue exitosa
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para actualizar un usuario existente (Update)
    public boolean updateUsuario(Usuarios usuario) {
        try {
            query = conn.prepareStatement(
                    "UPDATE usuarios SET nombre_usuario = ?, edad = ?, ingresos = ?, correo = ?, contraseña = ?, fecha_registro = ? WHERE id = ?");
            query.setString(1, usuario.getNombreUsuarios());
            query.setByte(2, usuario.getEdad());
            query.setFloat(3, usuario.getIngresos());
            query.setString(4, usuario.getCorreo());
            query.setString(5, usuario.getContraseña());
            query.setDate(6, usuario.getFecha_Registros());
            query.setInt(7, usuario.getId());

            return query.executeUpdate() > 0; // Retorna true si la actualización fue exitosa
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Método para eliminar un usuario (Delete)
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
    public Usuarios getUsuarioById(int id) {
        Usuarios usuario = null;
        try {
            query = conn.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
            query.setInt(1, id);

            ResultSet rs = query.executeQuery();
            if (rs.next()) {
                usuario = new Usuarios();
                usuario.setId(rs.getInt("id"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setEdad(rs.getByte("edad"));
                usuario.setIngresos(rs.getFloat("ingresos"));
                usuario.setCorreo(rs.getString("correo"));
                usuario.setContraseña(rs.getString("contraseña"));
                usuario.setFecha_Registro(rs.getDate("fecha_registro"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public Usuarios getUsuariosById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsuariosById'");
    }

    @Override
    public void updateUser(Usuarios usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Usuarios usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
}