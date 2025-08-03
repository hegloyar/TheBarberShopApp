/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hg.barber.shop.app;

import hg.barber.shop.app.db.InicializadorDB;
import hg.barber.shop.app.view.LoginForm;
import hg.barber.shop.app.view.MainForm;

/**
 *
 * @author galva
 */
public class BarberShopApp {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo aplicar el Look and Feel.");
        }

        InicializadorDB.crearTablas(); // Inicializa DB

        java.awt.EventQueue.invokeLater(() -> {
            new LoginForm().setVisible(true); // Abre la ventana de login
        });
    }
}
