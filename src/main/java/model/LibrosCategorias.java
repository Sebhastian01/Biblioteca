/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author linki
 */
public class LibrosCategorias {
    
    private int libroC_id;
    private int categoriaC_id;
    
    public LibrosCategorias(int libroC_id, int categoriaC_id) {
        this.libroC_id = libroC_id;
        this.categoriaC_id = categoriaC_id;
    }

    public int getLibroC_id() {
        return libroC_id;
    }

    public void setLibroC_id(int libroC_id) {
        this.libroC_id = libroC_id;
    }

    public int getCategoriaC_id() {
        return categoriaC_id;
    }

    public void setCategoriaC_id(int categoriaC_id) {
        this.categoriaC_id = categoriaC_id;
    }
    
    
    
}
