/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hg.barber.shop.app.db;

import hg.barber.shop.app.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author galva
 */
public class ClienteDAO {
    
public static boolean insertarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes(nombre, telefono, correo, notas) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionSQLite.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, cliente.getNombre());
                pstmt.setString(2, cliente.getTelefono());
                pstmt.setString(3, cliente.getCorreo());
                pstmt.setString(4, cliente.getNotas());

            pstmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al insertar cliente: " + e.getMessage());
            return false;
        }
    }   
    
}
