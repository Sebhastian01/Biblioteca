/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.CategoriaDAO;
import java.util.List;
import java.util.Scanner;
import model.Categoria;


public class CategoriaController {
    
    private CategoriaDAO categoriaDAO;

    public CategoriaController() {
        categoriaDAO = new CategoriaDAO();
    }
    
    public void crearCategoria(String nombre) {
        Categoria categoria = new Categoria(0, nombre);
        categoriaDAO.crearCategoria(categoria);
    }
    
    public List <Categoria> leerCategorias() {
        List<Categoria> categorias = categoriaDAO.leerCategorias();
        return categorias;
    }
    
    public void actualizarCategoria(int Id, String Nombre) {
        Categoria categoria = new Categoria(Id, Nombre);
        categoriaDAO.actualizarCategoria(categoria);
    }
    
    public void eliminarCategoria(int Id) {
        int categoria_id = Id;
        categoriaDAO.eliminarCategoria(categoria_id);
    }
}
