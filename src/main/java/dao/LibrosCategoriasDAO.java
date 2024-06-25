/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.LibrosCategorias;

/**
 *
 * @author linki
 */
public class LibrosCategoriasDAO {
    
    private Connection conexion;
    private ConexionBD conexionBD;

    public LibrosCategoriasDAO() {
        conexionBD = new ConexionBD();
        conexion = conexionBD.getConexion();
    }

    public void crearLibrosCategorias(LibrosCategorias librosCategorias) {
        String sql = "INSERT INTO libros_categorias (nombre) VALUES (?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, librosCategorias.getLibroC_id());
            statement.setInt(2, librosCategorias.getCategoriaC_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

    public List<LibrosCategorias> leerLibrosCategorias() {
        List<LibrosCategorias> librosCategorias = new ArrayList<>();
        String sql = "SELECT * FROM libros_categorias";
        try (Statement statement = conexion.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                int libroC_id = resultSet.getInt("libro_id");
                int categoriaC_id = resultSet.getInt("categoria_id");
                LibrosCategorias libroCategoria = new LibrosCategorias(libroC_id, categoriaC_id);
                librosCategorias.add(libroCategoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar los datos: " + e.getMessage());
        }
        return librosCategorias;
    }

    public void actualizarLibrosCategorias(LibrosCategorias librosCategorias) {
        String sql = "UPDATE libros_categorias SET libro_id = ?  categoria_id = ?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, librosCategorias.getLibroC_id());
            statement.setInt(2, librosCategorias.getCategoriaC_id());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al actualizar los datos: " + e.getMessage());
        }
    }

    public void eliminarLibrosCategorias(int libroC_id,int categoriaC_id ) {
        String sql = "DELETE FROM libros_categorias WHERE libro_id = ?  categoria_id =?";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setInt(1, libroC_id);
            statement.setInt(1, categoriaC_id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar los datos: " + e.getMessage());
        }
    }

    public void cerrarConexion() {
        conexionBD.closeConexion(conexion);
}
    
}
