/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.PrestamoDAO;
import java.util.List;
import model.Prestamo;

/**
 *
 * @author linki
 */
public class PrestamoController {
    
    private PrestamoDAO prestamoDAO;
    
    public PrestamoController() {
        prestamoDAO = new PrestamoDAO();
    }

public void crearPrestamo(int id_libroprestamo, int id_usuarioprestamo, String fecha_prestamo, String fecha_devolucion) {
        Prestamo prestamo = new Prestamo(0, id_libroprestamo, id_usuarioprestamo, fecha_prestamo, fecha_devolucion);
        prestamoDAO.crearPrestamo(prestamo);
    }

 public List <Prestamo> leerPrestamos() {
        List<Prestamo> prestamos = prestamoDAO.leerPrestamos();
        return prestamos;
    }

public void actualizarPrestamo(int id_prestamo, int id_libroprestamo, int id_usuarioprestamo, String fecha_prestamo, String fecha_devolucion) {
        Prestamo prestamo = new Prestamo(id_prestamo, id_libroprestamo, id_usuarioprestamo, fecha_prestamo, fecha_devolucion);
        prestamoDAO.actualizarLibro(prestamo);
    }

public void eliminarPrestamo(int id_prestamo) {
        prestamoDAO.eliminarPrestamo(id_prestamo);
    }
    
}
