/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hg.barber.shop.app.controller;
import hg.barber.shop.app.model.Cliente;
import hg.barber.shop.app.db.ClienteDAO;
/**
 *
 * @author galva
 */
public class ClienteController {
 
 public static boolean guardarCliente(String nombre, String telefono, String correo, String notas) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre es obligatorio.");
            return false;
        }

        Cliente c = new Cliente(nombre.trim(), telefono.trim(), correo.trim(), notas.trim());
        return ClienteDAO.insertarCliente(c);
    }

    public static Cliente buscarClientePorNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return null;
        }

        return ClienteDAO.buscarClientePorNombre(nombre.trim());
    }

    public static boolean eliminarClientePorNombre(String nombre) {
       if (nombre == null || nombre.trim().isEmpty()) {
        System.out.println("El nombre es obligatorio.");
        return false;
       }
      return ClienteDAO.eliminarClientePorNombre(nombre.trim());
}


    }

