/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hg.barber.shop.app.model;

/**
 *
 * @author galva
 */
public class Cliente {
    private int id;
    private String nombre;
    private String telefono;
    private String notas;

    public Cliente() { }

    public Cliente(String nombre, String telefono, String notas) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.notas = notas;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getNotas() { return notas; }
    public void setNotas(String notas) { this.notas = notas; }
}