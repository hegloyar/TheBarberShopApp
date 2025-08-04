/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hg.barber.shop.app.db;

import java.io.File;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author galva
 */
public class ConexionSQLite {
       
    public static Connection conectar() {
        Connection conn = null;

        try {
            // Obtener el path del .jar en tiempo de ejecución
            String jarPath = new File(ConexionSQLite.class
                    .getProtectionDomain()
                    .getCodeSource()
                    .getLocation()
                    .toURI())
                    .getParent();

            // Ruta absoluta hacia el archivo barbershop.db
            String dbPath = jarPath + File.separator + "barbershop.db";

            // Conexión a SQLite
            String url = "jdbc:sqlite:" + dbPath;
            conn = DriverManager.getConnection(url);

        } catch (URISyntaxException e) {
            System.out.println("Error de URI: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        return conn;
    }


public static Connection getConnection() throws SQLException {
    return conectar(); // 
}

       
}
