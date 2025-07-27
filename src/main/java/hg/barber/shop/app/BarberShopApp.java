/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hg.barber.shop.app;

import hg.barber.shop.app.db.InicializadorDB;
import hg.barber.shop.app.view.MainForm;

/**
 *
 * @author galva
 */
public class BarberShopApp {
    public static void main(String[] args) {
        InicializadorDB.crearTablas(); // <- Aquí se asegura la tabla
        new MainForm().setVisible(true);
    }
}
