/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import dao.LibroDAO;
import views.LibroView;
import model.Libro;

public class LibroController {
    private LibroDAO libroDAO;
    
    public LibroController() {
        libroDAO = new LibroDAO();
    }

public void crearLibro(String titulo, String autor, String editorial, int anio_publicacion, String isbn) {
        Libro libro = new Libro(0, titulo, autor, editorial, anio_publicacion, isbn);
        libroDAO.crearLibro(libro);
    }

 public List <Libro> leerLibros() {
        List<Libro> libros = libroDAO.leerLibros();
        return libros;
    }

public void actualizarLibros(int id_libro, String titulo, String autor, String editorial, int anio_publicacion, String isbn) {
        Libro libro = new Libro(id_libro, titulo, autor, editorial,anio_publicacion, isbn );
        libroDAO.actualizarLibro(libro);
    }

public void eliminarLibro(int id_libro) {
        libroDAO.eliminarLibro(id_libro);
    }

}




