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

    Cliente c = new Cliente(nombre, telefono, correo, notas);
    return ClienteDAO.insertarCliente(c);
}

    }

