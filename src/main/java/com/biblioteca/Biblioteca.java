/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import config.ConexionBD;
import dao.LibroDAO;
import views.LibroView;
import controller.LibroController;
import model.Libro;
import javax.swing.JFrame;



public class Biblioteca {

public static void main(String[] args) {
        
    LibroView Libroview = new LibroView ();
        Libroview.setVisible (true);
        JFrame frame = new JFrame ("Formulario tienda Rafa");
        frame.getContentPane().add(Libroview);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        
    
    }
}
