/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Prestamo;


public class PrestamoDAO {
    
    private Connection conexion;
    private ConexionBD conexionBD;

    public PrestamoDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }
    
    public void crearPrestamo(Prestamo prestamo) {
        String sql = "INSERT INTO prestamos (libro_id, usuario_id, fecha_prestamo, fecha_devolucion) VALUES (?,?,?,?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, prestamo.getId_libroprestamo());
            statement.setInt(2, prestamo.getId_usuarioprestamo());
            statement.setString(3, prestamo.getFecha_prestamo());
            statement.setString(4, prestamo.getFecha_devolucion());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<Prestamo> leerPrestamos() {
        List<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT * FROM prestamos";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int id_prestamo = resultSet.getInt("id");
                int id_libroprestamo = resultSet.getInt("libro_id");
                int id_usuarioprestamo = resultSet.getInt("usuario_id");
                String fecha_prestamo = resultSet.getString("fecha_prestamo");
                String fecha_devolucion = resultSet.getString("fecha_devolucion");
                Prestamo prestamo = new Prestamo(id_prestamo, id_libroprestamo, id_usuarioprestamo, fecha_prestamo, fecha_devolucion);
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return prestamos;
    }

    public void actualizarLibro(Prestamo prestamo) {
        String sql = "UPDATE prestamos SET libro_id =?, usuario_id=?, fecha_prestamo=?, fecha_devolucion=? WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, prestamo.getId_libroprestamo());
            statement.setInt(2, prestamo.getId_usuarioprestamo());
            statement.setString(3, prestamo.getFecha_prestamo());
            statement.setString(4, prestamo.getFecha_devolucion());
            statement.setInt(5, prestamo.getId_prestamo());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarPrestamo(int id_prestamo) {
        String sql = "DELETE FROM prestamos WHERE id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, id_prestamo);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
    }
    
}
