package org.example.c5.clases;

public class Cliente {
    private String nombre;
    private String email;

    // Constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre + " | Email: " + email);
    }
}