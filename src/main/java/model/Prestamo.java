/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author linki
 */
public class Prestamo {
    
    private int id_prestamo;
    private int id_libroprestamo;
    private int id_usuarioprestamo;
    private String fecha_prestamo;
    private String fecha_devolucion;

    public Prestamo (int id_prestamo, int id_libroprestamo, int id_usuarioprestamo, String fecha_prestamo, String fecha_devolución) {
        this.id_prestamo = id_prestamo;
        this.id_libroprestamo = id_libroprestamo;
        this.id_usuarioprestamo = id_usuarioprestamo;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_devolucion = fecha_devolución;
    }

    public int getId_prestamo() {
        return id_prestamo;
    }

    public void setId_prestamo(int id_prestamo) {
        this.id_prestamo = id_prestamo;
    }

    public int getId_libroprestamo() {
        return id_libroprestamo;
    }

    public void setId_libroprestamo(int id_libroprestamo) {
        this.id_libroprestamo = id_libroprestamo;
    }

    public int getId_usuarioprestamo() {
        return id_usuarioprestamo;
    }

    public void setId_usuarioprestamo(int id_usuarioprestamo) {
        this.id_usuarioprestamo = id_usuarioprestamo;
    }

    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
    
    
    
}
