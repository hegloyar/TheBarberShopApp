/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hg.barber.shop.app.db;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author galva
 */
public class InicializadorDB {
    
    public static void crearTablas() {
        String sqlClientes = """
            CREATE TABLE IF NOT EXISTS clientes (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT NOT NULL,
                telefono TEXT,
                notas TEXT
            );
        """;

        try (Connection conn = ConexionSQLite.conectar();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sqlClientes);
            System.out.println("Tabla clientes verificada/creada.");
        } catch (Exception e) {
            System.out.println("Error al crear tabla clientes: " + e.getMessage());
        }
    }
    
}
