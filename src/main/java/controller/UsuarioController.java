/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.UsuarioDAO;
import java.util.List;
import model.Usuario;

public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }

    public void crearUsuario(String nombre, String email, int telefono) {
        Usuario usuario = new Usuario(0, nombre, email, telefono);
        usuarioDAO.crearUsuario(usuario);
    }

    public List<Usuario> leerUsuarios() {
        List<Usuario> usuarios = usuarioDAO.leerUsuarios();
        return usuarios;
    }

    public void actualizarUsuario(int id_usuario, String nombre, String email, int telefono) {
        Usuario usuario = new Usuario(id_usuario, nombre, email, telefono);
        usuarioDAO.actualizarUsuario(usuario);
    }

    public void eliminarUsuario(int id_usuario) {
        usuarioDAO.eliminarUsuario(id_usuario);
    }

}
