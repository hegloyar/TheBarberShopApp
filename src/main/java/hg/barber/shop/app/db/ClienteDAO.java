/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hg.barber.shop.app.db;

import hg.barber.shop.app.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;




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


public static Cliente buscarClientePorNombre(String nombre) {
    Cliente clienteEncontrado = null;

    try (Connection conn = ConexionSQLite.getConnection();
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM clientes WHERE nombre = ?")) {
        
        stmt.setString(1, nombre);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            clienteEncontrado = new Cliente(
                rs.getString("nombre"),
                rs.getString("telefono"),
                rs.getString("correo"),
                rs.getString("notas")
            );
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return clienteEncontrado;
}

public static boolean eliminarClientePorNombre(String nombre) {
    String sql = "DELETE FROM clientes WHERE nombre = ?";

    try (Connection conn = ConexionSQLite.conectar();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, nombre);
        int filasAfectadas = pstmt.executeUpdate();

        return filasAfectadas > 0; // Devuelve true si al menos una fila fue eliminada.

    } catch (SQLException e) {
        System.out.println("Error al eliminar cliente: " + e.getMessage());
        return false;
    }
}






    
}
